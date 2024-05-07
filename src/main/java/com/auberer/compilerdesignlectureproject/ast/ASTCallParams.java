package com.auberer.compilerdesignlectureproject.ast;

import com.auberer.compilerdesignlectureproject.lexer.TokenType;

import java.util.Set;

public class ASTCallParams extends ASTNode {

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitCallParams(this);
    }

    public static Set<TokenType> getSelectionSet() {
        return ASTAssignExpr.getSelectionSet();
    }
}
