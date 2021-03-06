package net.sourceforge.jenesis4java.impl.util;

/*
 * #%L
 * Jenesis 4 Java Code Generator
 * %%
 * Copyright (C) 2000 - 2015 jenesis4java
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import java.util.List;

import net.sourceforge.jenesis4java.ElseIf;
import net.sourceforge.jenesis4java.If;
import net.sourceforge.jenesis4java.LocalBlock;
import net.sourceforge.jenesis4java.Statement;

public class BlockUtil {

    public static boolean isBlockWithAbruptCompletion(List<Statement> stmts) {
        Statement last;
        if (stmts.size() > 0) {
            last = stmts.get(stmts.size() - 1);
        } else {
            return false;
        }

        if (last instanceof LocalBlock) {
            return last.isBlockWithAbruptCompletion();

        }
        if (last instanceof If) {
            If ifStmt = (If) last;
            List<Statement> subStatements = ifStmt.getStatements();
            boolean result = isBlockWithAbruptCompletion(subStatements);
            if (result) {
                if (ifStmt.getElse() != null) {
                    result = isBlockWithAbruptCompletion(ifStmt.getElse().getStatements());
                }
            }
            if (ifStmt.getElseIfs() != null) {
                for (ElseIf elseif : ifStmt.getElseIfs()) {
                    if (result) {
                        result = isBlockWithAbruptCompletion(elseif.getStatements());
                    }
                }
            }
            return result;
        }
        return last.isAbruptCompletionStatement();
    }
}
