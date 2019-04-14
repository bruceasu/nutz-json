/*
 * Copyright (C) 2017 Bruce Asu<bruceasu@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom
 * the Software is furnished to do so, subject to the following conditions:
 *  　　
 * 　　The above copyright notice and this permission notice shall
 * be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES
 * OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package org.nutz.json.context;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Context extends Cloneable {

    Context set(String name, Object value);

    Set<String> keys();

    Map<String, Object> getInnerMap();

    Context putAll(Object obj);

    Context putAll(String prefix, Object obj);

    boolean has(String key);

    Context clear();

    int size();

    boolean isEmpty();

    Object get(String name);

    Object get(String name, Object dft);

    <T> T getAs(Class<T> type, String name);

    <T> T getAs(Class<T> type, String name, T dft);

    int getInt(String name);

    int getInt(String name, int dft);

    String getString(String name);

    String getString(String name, String dft);

    boolean getBoolean(String name);

    boolean getBoolean(String name, boolean dft);

    float getFloat(String name);

    float getFloat(String name, float dft);

    double getDouble(String name);

    double getDouble(String name, double dft);

    Map<String, Object> getMap(String name);

    List<Object> getList(String name);

    <T> List<T> getList(Class<T> classOfT, String name);

    Context clone();

}






