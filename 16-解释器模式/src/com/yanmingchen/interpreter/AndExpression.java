package com.yanmingchen.interpreter;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:21 2018/6/15
 * @Description:并且 表达式类
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }

}
