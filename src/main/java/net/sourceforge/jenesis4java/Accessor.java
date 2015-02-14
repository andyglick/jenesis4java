package net.sourceforge.jenesis4java;

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
 * <code>Expression</code> subinterface for expressions which access data
 * including field accesses, array accesses, and method invocations. An
 * <code>Accessor</code> expression has two parts with the general form
 * <qualifier> dot <name>. The qualifier references the handle to object where
 * the resource resides and the name references the name of the resource. For
 * example, in <code>this.id</code>, <code>this</code> is the qualifier and
 * <code>id</code> is the name. The qualifier is optional, in which case the
 * <code>Accessor</code> will render without the dot.
 */
public interface Accessor extends Variable {

    /**
     * return the qualifier expression of this access.
     */
    Expression getQualExpression();

    /**
     * Sets the qualified name of the resource container object.
     */
    String getQualifier();

    /**
     * Sets the qualified name of the resource container object.
     */
    Accessor setQualifier(String name);
}