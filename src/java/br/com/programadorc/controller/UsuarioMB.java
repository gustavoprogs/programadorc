package br.com.programadorc.controller;

import br.com.programadorc.domain.Usuario;
import br.com.programadorc.services.UsuarioService;
import br.com.programadorc.util.UtilMessages;
import java.io.Serializable;
import javafx.scene.control.RadioButton;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "usuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {

    private Usuario usuario = new Usuario();
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private char questao1;
    private char questao2;
    private char questao3;
    private char questao4;
    private char questao5;
    private char questao6;
    private char questao7;
    private char questao8;
    private char questao9;
    private char questao10;
    private char questao11;
    private char questao12;
    private char questao13;
    private char questao14;
    private char questao15;
    private char questao16;
    private char questao17;
    private char questao18;
    private char questao19;
    private char questao20;
    private char questao21;
    private char questao22;
    private char questao23;
    private char questao24;
    private char questao25;
    private char questao26;
    private char questao27;
    private char questao28;
    private char questao29;
    private char questao30;
    private Integer pontos;
    private Integer pontos2;
    private Integer pontos3;

    public UsuarioMB() {
        pontos = 0;
        pontos2 = 0;
        pontos3 = 0;
    }

    public void inicializarHibernate() {
        UsuarioService service = new UsuarioService();
        service.inicializarHibernate();
    }

    public String autenticar() {
        UsuarioService service = new UsuarioService();
        usuario = new Usuario(email, senha);
        if (service.autenticar(usuario)) {
            return "home.xhtml?faces-redirect=true";
        } else {
            return "index2.xhtml?faces-redirect=true";
        }
    }

    public String inserir() {
        UsuarioService service = new UsuarioService();
        if (service.inserir(usuario)) {
            return "index.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String alterar() {
        UsuarioService service = new UsuarioService();
        if (service.alterar(usuario)) {
            return "list.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String carregarDados(Usuario usuario) {
        HttpServletRequest servReq = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = servReq.getSession(true);
        session.setAttribute("usuario", usuario);
        return "alter.xhtml?faces-redirect=true";
    }

    public void recuperarUsuario() {
        HttpServletRequest servReq = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = servReq.getSession(true);
        this.usuario = (Usuario) session.getAttribute("usuario");
    }

    public String excluir(Usuario usuario) {
        UsuarioService service = new UsuarioService();
        if (service.excluir(usuario)) {
            return "list.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String Calcular() {

        if (questao1 == 'b') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao2 == 'c') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao3 == 'a') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao4 == 'd') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao5 == 'a') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao6 == 'd') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao7 == 'a') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao8 == 'b') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao9 == 'c') {
            pontos++;
            System.out.println(pontos);
        }

        if (questao10 == 'b') {
            pontos++;
            System.out.println(pontos);
        }

        if (pontos >= 6) {
            System.out.println("maior");
            return "passou.xhtml?faces-redirect=true";
        } else {
            return "reprovou.xhtml?faces-redirect=true";
        }

    }

    public String Calcular2() {

        if (questao11 == 'a') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao12 == 'b') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao13 == 'c') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao14 == 'c') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao15 == 'd') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao16 == 'a') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao17 == 'c') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao18 == 'a') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao19 == 'd') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (questao20 == 'b') {
            pontos2++;
            System.out.println(pontos2);
        }

        if (pontos2 >= 6) {
            System.out.println("maior");
            return "passou2.xhtml?faces-redirect=true";
        } else {
            return "reprovou2.xhtml?faces-redirect=true";
        }

    }

    public String Calcular3() {

        if (questao21 == 'b') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao22 == 'c') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao23 == 'a') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao24 == 'a') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao25 == 'd') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao26 == 'b') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao27 == 'd') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao28 == 'd') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao29 == 'a') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (questao30 == 'b') {
            pontos3++;
            System.out.println(pontos3);
        }

        if (pontos3 >= 6) {
            System.out.println("maior");
            return "passou3.xhtml?faces-redirect=true";
        } else {
            return "reprovou3.xhtml?faces-redirect=true";
        }

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getQuestao1() {
        return questao1;
    }

    public void setQuestao1(char questao1) {
        this.questao1 = questao1;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public char getQuestao2() {
        return questao2;
    }

    public void setQuestao2(char questao2) {
        this.questao2 = questao2;
    }

    public char getQuestao3() {
        return questao3;
    }

    public void setQuestao3(char questao3) {
        this.questao3 = questao3;
    }

    public char getQuestao4() {
        return questao4;
    }

    public void setQuestao4(char questao4) {
        this.questao4 = questao4;
    }

    public char getQuestao5() {
        return questao5;
    }

    public void setQuestao5(char questao5) {
        this.questao5 = questao5;
    }

    public char getQuestao6() {
        return questao6;
    }

    public void setQuestao6(char questao6) {
        this.questao6 = questao6;
    }

    public char getQuestao7() {
        return questao7;
    }

    public void setQuestao7(char questao7) {
        this.questao7 = questao7;
    }

    public char getQuestao8() {
        return questao8;
    }

    public void setQuestao8(char questao8) {
        this.questao8 = questao8;
    }

    public char getQuestao9() {
        return questao9;
    }

    public void setQuestao9(char questao9) {
        this.questao9 = questao9;
    }

    public char getQuestao10() {
        return questao10;
    }

    public void setQuestao10(char questao10) {
        this.questao10 = questao10;
    }

    public char getQuestao11() {
        return questao11;
    }

    public void setQuestao11(char questao11) {
        this.questao11 = questao11;
    }

    public char getQuestao12() {
        return questao12;
    }

    public void setQuestao12(char questao12) {
        this.questao12 = questao12;
    }

    public char getQuestao13() {
        return questao13;
    }

    public void setQuestao13(char questao13) {
        this.questao13 = questao13;
    }

    public char getQuestao14() {
        return questao14;
    }

    public void setQuestao14(char questao14) {
        this.questao14 = questao14;
    }

    public char getQuestao15() {
        return questao15;
    }

    public void setQuestao15(char questao15) {
        this.questao15 = questao15;
    }

    public char getQuestao16() {
        return questao16;
    }

    public void setQuestao16(char questao16) {
        this.questao16 = questao16;
    }

    public char getQuestao17() {
        return questao17;
    }

    public void setQuestao17(char questao17) {
        this.questao17 = questao17;
    }

    public char getQuestao18() {
        return questao18;
    }

    public void setQuestao18(char questao18) {
        this.questao18 = questao18;
    }

    public char getQuestao19() {
        return questao19;
    }

    public void setQuestao19(char questao19) {
        this.questao19 = questao19;
    }

    public char getQuestao20() {
        return questao20;
    }

    public void setQuestao20(char questao20) {
        this.questao20 = questao20;
    }

    public char getQuestao21() {
        return questao21;
    }

    public void setQuestao21(char questao21) {
        this.questao21 = questao21;
    }

    public char getQuestao22() {
        return questao22;
    }

    public void setQuestao22(char questao22) {
        this.questao22 = questao22;
    }

    public char getQuestao23() {
        return questao23;
    }

    public void setQuestao23(char questao23) {
        this.questao23 = questao23;
    }

    public char getQuestao24() {
        return questao24;
    }

    public void setQuestao24(char questao24) {
        this.questao24 = questao24;
    }

    public char getQuestao25() {
        return questao25;
    }

    public void setQuestao25(char questao25) {
        this.questao25 = questao25;
    }

    public char getQuestao26() {
        return questao26;
    }

    public void setQuestao26(char questao26) {
        this.questao26 = questao26;
    }

    public char getQuestao27() {
        return questao27;
    }

    public void setQuestao27(char questao27) {
        this.questao27 = questao27;
    }

    public char getQuestao28() {
        return questao28;
    }

    public void setQuestao28(char questao28) {
        this.questao28 = questao28;
    }

    public char getQuestao29() {
        return questao29;
    }

    public void setQuestao29(char questao29) {
        this.questao29 = questao29;
    }

    public char getQuestao30() {
        return questao30;
    }

    public void setQuestao30(char questao30) {
        this.questao30 = questao30;
    }

    public Integer getPontos2() {
        return pontos2;
    }

    public void setPontos2(Integer pontos2) {
        this.pontos2 = pontos2;
    }

    public Integer getPontos3() {
        return pontos3;
    }

    public void setPontos3(Integer pontos3) {
        this.pontos3 = pontos3;
    }

}
