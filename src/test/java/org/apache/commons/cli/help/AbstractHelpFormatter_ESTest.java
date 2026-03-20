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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Function;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.help.HelpAppendable;
import org.apache.commons.cli.help.HelpFormatter;
import org.apache.commons.cli.help.OptionFormatter;
import org.apache.commons.cli.help.TableDefinition;
import org.apache.commons.cli.help.TextHelpAppendable;
import org.apache.commons.cli.help.TextStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractHelpFormatter_ESTest extends AbstractHelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      LinkedHashSet<Option> linkedHashSet0 = new LinkedHashSet<Option>(5);
      List<Option> list0 = helpFormatter0.sort((Iterable<Option>) linkedHashSet0);
      TreeSet<Option> treeSet0 = new TreeSet<Option>(list0);
      helpFormatter0.printHelp("hUK\"ElF;", "@", (Iterable<Option>) treeSet0, "hUK\"ElF;", false);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      helpFormatter0.setSyntaxPrefix("NO_ARGS_ALLOWED");
      helpFormatter0.printHelp("org.apache.commons.cli.Options", "org.apache.commons.cli.Options", options0, "NO_ARGS_ALLOWED", false);
      assertEquals("NO_ARGS_ALLOWED", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      helpFormatter0.setSyntaxPrefix("org.apache.commons.text.similarity.SimilarityCharacterInput");
      List<Option> list0 = helpFormatter0.sort((Iterable<Option>) collection0);
      helpFormatter0.printHelp("org.apache.commons.cli.help.AbstractHelpFormatter$Builder", (String) null, (Iterable<Option>) list0, "org.apache.commons.text.similarity.SimilarityCharacterInput", true);
      assertEquals("org.apache.commons.text.similarity.SimilarityCharacterInput", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      List<Option> list0 = helpFormatter0.sort(options0);
      TableDefinition tableDefinition0 = helpFormatter0.getTableDefinition(list0);
      helpFormatter0.printOptions(tableDefinition0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      String string0 = helpFormatter_Builder0.getOptionGroupSeparator();
      assertEquals(" | ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      TextHelpAppendable textHelpAppendable0 = (TextHelpAppendable)helpFormatter_Builder0.getHelpAppendable();
      assertEquals(3, TextHelpAppendable.DEFAULT_INDENT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      Comparator<Option> comparator0 = helpFormatter_Builder0.getComparator();
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.asThis();
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      Option option0 = new Option("$VALUES", true, " | ");
      options0.addOption(option0);
      String string0 = helpFormatter0.toSyntaxOptions(options0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("[-$VALUES <arg>]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      options0.addOption("6aN", "", true, "LongOpt");
      helpFormatter0.sort(options0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      ArrayList<Option> arrayList0 = new ArrayList<Option>(74);
      Option option0 = new Option("wildcard", "wildcard");
      arrayList0.add(option0);
      helpFormatter0.sort((Iterable<Option>) arrayList0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      
      helpFormatter0.setSyntaxPrefix("");
      helpFormatter0.getSyntaxPrefix();
      assertEquals("", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setOptionGroupSeparator("");
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder1);
      String string0 = helpFormatter0.getOptionGroupSeparator();
      assertEquals("", string0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Option option0 = new Option("88_c", "u$YvkJ*E{Qqf", true, "");
      option0.setRequired(true);
      helpFormatter0.getOptionFormatter(option0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.toSyntaxOptions((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.toSyntaxOptions((OptionGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      LinkedHashSet<Option> linkedHashSet0 = new LinkedHashSet<Option>(1);
      Option option0 = new Option((String) null, "usage: ", true, "G=e!2\"1S*a`#0");
      linkedHashSet0.add(option0);
      // Undeclared exception!
      try { 
        helpFormatter0.toSyntaxOptions((Iterable<Option>) linkedHashSet0, (Function<Option, OptionGroup>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      ArrayList<Option> arrayList0 = new ArrayList<Option>();
      arrayList0.add((Option) null);
      // Undeclared exception!
      try { 
        helpFormatter0.toSyntaxOptions((Iterable<Option>) arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.OptionFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      HashSet<Option> hashSet0 = new HashSet<Option>(74);
      Option option0 = new Option("KSi", false, "/xI>)|Ifv73~/pBVOLA");
      hashSet0.add(option0);
      Option option1 = new Option((String) null, false, "");
      hashSet0.add(option1);
      // Undeclared exception!
      try { 
        helpFormatter0.sort((Iterable<Option>) hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      LinkedList<TextStyle> linkedList0 = new LinkedList<TextStyle>();
      Vector<TextStyle> vector0 = new Vector<TextStyle>(linkedList0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.addFirst((String) null);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<List<String>> priorityQueue0 = new PriorityQueue<List<String>>(74, comparator0);
      TableDefinition tableDefinition0 = TableDefinition.from("#", vector0, linkedList1, priorityQueue0);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(tableDefinition0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      LinkedHashSet<Option> linkedHashSet0 = new LinkedHashSet<Option>();
      TableDefinition tableDefinition0 = helpFormatter0.getTableDefinition(linkedHashSet0);
      List<TextStyle> list0 = tableDefinition0.columnTextStyles();
      Vector<String> vector0 = new Vector<String>();
      TreeSet<List<String>> treeSet0 = new TreeSet<List<String>>();
      PriorityQueue<List<String>> priorityQueue0 = new PriorityQueue<List<String>>((SortedSet<? extends List<String>>) treeSet0);
      TableDefinition tableDefinition1 = TableDefinition.from("", list0, vector0, priorityQueue0);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(tableDefinition1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((Iterable<Option>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("Illegal IOCase name: ", "Illegal IOCase name: ", (Options) null, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("1DSv@,Ko;n@[;", "1DSv@,Ko;n@[;", (Iterable<Option>) null, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      OptionGroup optionGroup0 = new OptionGroup();
      helpFormatter0.toSyntaxOptions(optionGroup0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Vector<Option> vector0 = new Vector<Option>();
      ArrayDeque<Option> arrayDeque0 = new ArrayDeque<Option>(vector0);
      Option option0 = new Option((String) null, true, "");
      arrayDeque0.add(option0);
      Function<Option, OptionGroup> function0 = (Function<Option, OptionGroup>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(any(org.apache.commons.cli.Option.class));
      String string0 = helpFormatter0.toSyntaxOptions((Iterable<Option>) arrayDeque0, function0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("[ <arg>]", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.sort((Iterable<Option>) null);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      helpFormatter0.printHelp(", Size B: ", "", options0, "", true);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((TableDefinition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.help.TextHelpAppendable", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      PriorityQueue<Option> priorityQueue0 = new PriorityQueue<Option>(74, helpFormatter0.DEFAULT_COMPARATOR);
      helpFormatter0.printOptions((Iterable<Option>) priorityQueue0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Options options0 = new Options();
      helpFormatter0.toSyntaxOptions(options0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option((String) null, true, "usage: ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      String string0 = helpFormatter0.toSyntaxOptions(optionGroup1);
      assertEquals(" <arg>", string0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, "usage: ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      String string0 = helpFormatter0.toSyntaxOptions(optionGroup1);
      assertEquals("[ <arg>]", string0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Vector<Option> vector0 = new Vector<Option>();
      ArrayDeque<Option> arrayDeque0 = new ArrayDeque<Option>(vector0);
      Option option0 = new Option((String) null, true, "");
      arrayDeque0.add(option0);
      String string0 = helpFormatter0.toSyntaxOptions((Iterable<Option>) arrayDeque0);
      assertEquals("[ <arg>]", string0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      Vector<Option> vector0 = new Vector<Option>();
      ArrayDeque<Option> arrayDeque0 = new ArrayDeque<Option>(vector0);
      Option option0 = new Option((String) null, true, "");
      arrayDeque0.add(option0);
      OptionGroup optionGroup0 = new OptionGroup();
      Function<Option, OptionGroup> function0 = (Function<Option, OptionGroup>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(optionGroup0).when(function0).apply(any(org.apache.commons.cli.Option.class));
      String string0 = helpFormatter0.toSyntaxOptions((Iterable<Option>) arrayDeque0, function0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.sort((Options) null);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      TreeSet<Option> treeSet0 = new TreeSet<Option>(helpFormatter0.DEFAULT_COMPARATOR);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", (Iterable<Option>) treeSet0, " | ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.help.AbstractHelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      OptionFormatter.Builder optionFormatter_Builder0 = helpFormatter_Builder0.getOptionFormatBuilder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setOptionFormatBuilder(optionFormatter_Builder0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setOptionFormatBuilder((OptionFormatter.Builder) null);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpAppendable helpAppendable0 = helpFormatter0.getHelpAppendable();
      helpFormatter_Builder0.setHelpAppendable(helpAppendable0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setHelpAppendable((HelpAppendable) null);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      String string0 = helpFormatter0.toArgName("");
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("<>", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      String string0 = helpFormatter0.getSyntaxPrefix();
      assertEquals("usage: ", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = helpFormatter0.getOptionGroupSeparator();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" | ", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      helpFormatter0.getComparator();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      helpFormatter0.toSyntaxOptions((Iterable<Option>) null);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getOptionFormatBuilder();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter(helpFormatter_Builder0);
      helpFormatter0.getSerializer();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      helpFormatter0.printOptions(options0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Option option0 = new Option("88_c", "u$YvkJ*E{Qqf", true, "usage: ");
      helpFormatter0.getOptionFormatter(option0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.setComparator(helpFormatter0.DEFAULT_COMPARATOR);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }
}
