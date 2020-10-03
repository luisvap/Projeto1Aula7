package br.edu.uniso.apicombanco;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService {


    @Autowired
    private AlunoRepository ar;
    // esse metodo serve pra salvar um aluno no banco
    // cujos dados estao vindos da camada de controller
    // como dados da API
    public void salvar(Aluno aluno){

        ar.save(aluno);
    }


    public void deletar(int ra){
        ar.deleteById(ra);
    }

    public List<Aluno> listarTodos(){
        return ar.findAll();
    }

    public Aluno obterAluno(int ra){
        return ar.findById(ra).get();
    }

}
