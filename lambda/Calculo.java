package lambda;

//define que a  nossa interface será funcional (podendo conter apenas um método abstrato, ou seja que não possua implementação)
//métodos default não interferem.

@FunctionalInterface

public interface Calculo {

    public double executar(double a, double b);

}
