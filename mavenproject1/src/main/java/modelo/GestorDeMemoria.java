package modelo;

import java.util.Stack;

public class GestorDeMemoria {
    private Stack<Double> pilaDeOperandos;

    public GestorDeMemoria() {
        pilaDeOperandos = new Stack<>();
    }

    public double evaluarExpresion(String expresion) {
        String[] tokens = expresion.split(" ");
        for (String token : tokens) {
            if (esOperando(token)) {
                pilaDeOperandos.push(Double.parseDouble(token));
            } else if (esOperador(token)) {
                double operand2 = pilaDeOperandos.pop();
                double operand1 = pilaDeOperandos.pop();
                double resultado = aplicarOperador(operand1, operand2, token);
                pilaDeOperandos.push(resultado);
            } else {
                throw new IllegalArgumentException("Token inválido: " + token);
            }
        }
        if (pilaDeOperandos.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida");
        }
        return pilaDeOperandos.pop();
    }

    private boolean esOperando(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double aplicarOperador(double operand1, double operand2, String operador) {
        switch (operador) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
