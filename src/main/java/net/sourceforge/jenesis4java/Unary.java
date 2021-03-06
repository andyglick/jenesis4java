package net.sourceforge.jenesis4java;

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

/**
 * Copyright (C) 2008, 2010 Richard van Nieuwenhoven - ritchie [at] gmx [dot] at
 * Copyright (C) 2000, 2001 Paul Cody Johnston - pcj@inxar.org <br>
 * This file is part of Jenesis4java. Jenesis4java is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.<br>
 * Jenesis4java is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.<br>
 * You should have received a copy of the GNU Lesser General Public License
 * along with Jenesis4java. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * <code>Expression</code> subinterface for expressions which have a single
 * operand.
 */
public interface Unary extends Expression {

    /**
     * Unary function type for a group of parentheses: <code>(expr)</code>.
     */
     int GROUP = 0;

    /**
     * Unary function type for a logical complement: <code>(!true)</code>.
     */
     int NOT = 1;

    /**
     * Unary function type for bitwise complement: <code>(~1)</code>.
     */
     int BITWISE_NOT = 2;

    /**
     * Unary function type for arithmetic sign complement: <code>(-1)</code>.
     */
     int NEG = 3;

    /**
     * Unary function type for arithmetic sign identity: <code>(+1)</code>.
     */
     int POS = 4;

    /**
     * Unary function type for arithmetic ante-increment: <code>(++i)</code>.
     */
     int AI = 5;

    /**
     * Unary function type for arithmetic post-increment: <code>(i++)</code>.
     */
     int PI = 6;

    /**
     * Unary function type for arithmetic ante-decrement: <code>(--i)</code>.
     */
     int AD = 7;

    /**
     * Unary function type for arithmetic post-decrement: <code>(i--)</code>.
     */
     int PD = 8;

    /**
     * Getter method for the operand.
     */
    Expression getValue();

    /**
     * Setter method for the operand.
     */
    Unary setValue(Expression e);

    /**
     * Returns the type of this unary function as one of the constants in this
     * interface.
     */
    int type();
}
