import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;

public class AlugueldeVeiculos extends JFrame implements ActionListener {

    //1) Criar um projeto de aluguel de veículos, conforme o protótipo abaixo:
    //
    //Incluir máscaras para: CPF, Tel, Placa, Ano, Data de Locação, Data de Entrega.
    //
    //Ao clicar no botão Salvar exibir a mensagem: Aluguel realizado com sucesso!

    public static void main(String[] args) {
        AlugueldeVeiculos aluguel = new AlugueldeVeiculos();
        aluguel.alugacarros();



    }

    private JButton salvar;

    public void alugacarros(){
        Container janela = getContentPane(); //variável
        setLayout(null);

//define rótulos e botoes

    //dados do cliente
        JLabel labelDadosCL = new JLabel("Dados do cliente");
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");
        labelDadosCL.setBounds(50,20,100,20);
        labelNome.setBounds(50,60,100,20);
        labelCpf.setBounds(50, 90, 100, 20);
        labelTel.setBounds(50, 120, 100, 20);

    //dados do carro

        JLabel labelDadosCar = new JLabel("Dados do carro");
        JLabel labelNomeCar = new JLabel("Nome do Carro: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDtaLoc = new JLabel("Data de Locação: ");
        JLabel labelDtaEnt = new JLabel("Data de Entrega: ");
        labelDadosCar.setBounds(50,160,100,20);
        labelNomeCar.setBounds(50,190,100,20);
        labelPlaca.setBounds(50, 220, 100, 20);
        labelAno.setBounds(50,250,100,20);
        labelDtaLoc.setBounds(50, 280, 100, 20);
        labelDtaEnt.setBounds(50, 310, 100, 20);


//define as máscaras
        //dados do cliente
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;

        //dados do carro
        MaskFormatter mascaraNomeCar = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno= null;
        MaskFormatter mascaraDtaLoc= null;
        MaskFormatter mascaraDtaEnt= null;

        try {

            mascaraNome = new MaskFormatter("********************************");
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraNomeCar = new MaskFormatter("*********************");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraDtaLoc = new MaskFormatter("##/##/####");
            mascaraDtaEnt = new MaskFormatter("##/##/####");


        }
        catch(ParseException excp) {
            System.err.println("Erro:" + excp.getLocalizedMessage());
            System.exit(-1);

        }
//seta as máscaras nos objetos


        JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCPF);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);

        JFormattedTextField jFormattedTextNomeCar = new JFormattedTextField(mascaraNomeCar);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDtaLoc = new JFormattedTextField(mascaraDtaLoc);
        JFormattedTextField jFormattedTextDtaEnt = new JFormattedTextField(mascaraDtaEnt);

        jFormattedTextNome.setBounds(160,60,240,20);
        jFormattedTextCpf.setBounds(160,90,100,20);
        jFormattedTextTel.setBounds(160,120,100,20);

        jFormattedTextNomeCar.setBounds(160,200,140,20);
        jFormattedTextPlaca.setBounds(160,220,100,20);
        jFormattedTextAno.setBounds(160,250,100,20);
        jFormattedTextDtaLoc.setBounds(160,280,100,20);
        jFormattedTextDtaEnt.setBounds(160,310,100,20);

//Adiciona campos de textos com máscaras na tela

        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextTel);
        //janela.add(jFormattedTextDadosCar);
        janela.add(jFormattedTextNomeCar);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextDtaLoc);
        janela.add(jFormattedTextDtaEnt);


 //Adiciona os rótulos

        janela.add(labelDadosCL);
        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);
        janela.add(labelDadosCar);
        janela.add(labelNomeCar);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDtaLoc);
        janela.add(labelDtaEnt);


    //define formato da caixa principal


         salvar = new JButton("SALVAR");
        salvar.setBounds(160,350,100,20);
        salvar.addActionListener(this);
        janela.add(salvar);

        setSize(500,800);


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoFinal = (JButton) e.getSource();

        if (botaoFinal == salvar) {


            JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }
    }
}
