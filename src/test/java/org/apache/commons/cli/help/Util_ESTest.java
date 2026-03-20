/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.cli.help;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.cli.help.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Util.rtrim("\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Util.ltrim(" KK\"$Nh(l!l;ZkQ<cR");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Util.indexOfNonWhitespace("J", 32);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Util.rtrim((String) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Util.repeatSpace(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Util.repeat(1, 'J');
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Util.repeat(0, '8');
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Util.isWhitespace(' ');
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Util.isWhitespace('x');
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Util.isEmpty("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Util.isEmpty("KK\"$Nh(l!l;ZkQ<cR");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Util.indexOfNonWhitespace("=>#!Ps\u0002e7vyfeV", 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Util.indexOfNonWhitespace("org.apache.commons.cli.help.Util", 1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Util.defaultValue((CharBuffer) null, (CharBuffer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Util.repeatSpace('\uFFFF');
      // Undeclared exception!
      Util.rtrim(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.repeatSpace((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.repeat((-393), '}');
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.indexOfNonWhitespace("JDQq_2b", (-2181));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        Util.indexOfNonWhitespace(charBuffer0, (-3609));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Util.rtrim("");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Util.rtrim("\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E\u000E");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Util.indexOfNonWhitespace((CharSequence) null, (-2181));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Util.ltrim("              ");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Util.defaultValue("", "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Util.defaultValue("&*LCW0*>ahJ", "&*LCW0*>ahJ");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Util.repeatSpace('\uFFFF');
      // Undeclared exception!
      Util.ltrim(string0);
  }
}
