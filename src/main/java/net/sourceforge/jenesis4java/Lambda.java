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
 * Models Java 8 lambda expressions.
 */
// TODO: clarify what Lambda might extend (beyond Codeable).
public interface Lambda extends Codeable {

    /**
     * Adds a new formal parameter with the given class type and name to this {@code Lambda}
     * and returns this {@code Lambda}.
     */
    Lambda addParameter(Class<?> type, String name);

    /**
     * Adds a new formal parameter with the given type and name to this {@code Lambda}
     * and returns this {@code Lambda}.
     */
    Lambda addParameter(Type type, String name);

    /**
     * TODO
     *
     *
     * @param name@return
     */
    Lambda addParameter(String name);

    /**
     * Sets the body of the {@code Lambda} (as an {@code Expression}).
     *
     * @param body the body of the {@code Lambda}
     * @return the {@code Lambda}
     */
    Lambda setBody(Expression body);

    /**
     * Create a new Block as body of the {@code Lambda}.
     *
     * @return the {@code Lambda}
     */
    Block newBodyBlock();
}