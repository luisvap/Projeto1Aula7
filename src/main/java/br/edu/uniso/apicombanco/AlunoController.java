package br.edu.uniso.apicombanco;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService service;

    // obter
    @GetMapping("/alunos")
    public List<Aluno> listaAlunos(){
        return service.listarTodos();
    }

    // criar um novo
    @PostMapping("/alunos")
    public void adicionar(@RequestBody Aluno aluno){
        service.salvar(aluno);
    }



    // atualizar
    @PutMapping("/alunos/{ra}")
    public ResponseEntity<?> atualizar(@RequestBody Aluno aluno, @PathVariable Integer ra){

        // vou checar se o aluno existe
        Aluno existente = service.obterAluno(ra);
        // se for diferente de nulo, eh pq existe, retornou né, zé
        if(existente != null)
        {
            service.salvar(aluno);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
