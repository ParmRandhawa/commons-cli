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
import java.util.Comparator;
import java.util.TreeSet;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.help.HelpFormatter;
import org.apache.commons.cli.help.TableDefinition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.getTableDefinition((Iterable<Option>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setComparator((Comparator<Option>) null);
      HelpFormatter helpFormatter0 = null;
      try {
        helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // comparator
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowSince(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      TreeSet<Option> treeSet0 = new TreeSet<Option>();
      TableDefinition tableDefinition0 = helpFormatter0.getTableDefinition(treeSet0);
      assertNotNull(tableDefinition0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      TreeSet<Option> treeSet0 = new TreeSet<Option>();
      TableDefinition tableDefinition0 = helpFormatter0.getTableDefinition(treeSet0);
      assertNotNull(tableDefinition0);
  }
}
