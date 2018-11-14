/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/lineNumber")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrLineNumberTestGenerated extends AbstractIrLineNumberTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInLineNumber() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lineNumber"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM_IR, true);
    }

    @TestMetadata("anonymousFunction.kt")
    public void testAnonymousFunction() throws Exception {
        runTest("compiler/testData/lineNumber/anonymousFunction.kt");
    }

    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("compiler/testData/lineNumber/class.kt");
    }

    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        runTest("compiler/testData/lineNumber/classObject.kt");
    }

    @TestMetadata("defaultParameter.kt")
    public void testDefaultParameter() throws Exception {
        runTest("compiler/testData/lineNumber/defaultParameter.kt");
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("compiler/testData/lineNumber/enum.kt");
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        runTest("compiler/testData/lineNumber/for.kt");
    }

    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        runTest("compiler/testData/lineNumber/if.kt");
    }

    @TestMetadata("inlineSimpleCall.kt")
    public void testInlineSimpleCall() throws Exception {
        runTest("compiler/testData/lineNumber/inlineSimpleCall.kt");
    }

    @TestMetadata("localFunction.kt")
    public void testLocalFunction() throws Exception {
        runTest("compiler/testData/lineNumber/localFunction.kt");
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("compiler/testData/lineNumber/object.kt");
    }

    @TestMetadata("propertyAccessor.kt")
    public void testPropertyAccessor() throws Exception {
        runTest("compiler/testData/lineNumber/propertyAccessor.kt");
    }

    @TestMetadata("psvm.kt")
    public void testPsvm() throws Exception {
        runTest("compiler/testData/lineNumber/psvm.kt");
    }

    @TestMetadata("simpleSmap.kt")
    public void testSimpleSmap() throws Exception {
        runTest("compiler/testData/lineNumber/simpleSmap.kt");
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        runTest("compiler/testData/lineNumber/topLevel.kt");
    }

    @TestMetadata("trait.kt")
    public void testTrait() throws Exception {
        runTest("compiler/testData/lineNumber/trait.kt");
    }

    @TestMetadata("tryCatch.kt")
    public void testTryCatch() throws Exception {
        runTest("compiler/testData/lineNumber/tryCatch.kt");
    }

    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        runTest("compiler/testData/lineNumber/while.kt");
    }

    @TestMetadata("compiler/testData/lineNumber/custom")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Custom extends AbstractIrLineNumberTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInCustom() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lineNumber/custom"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM_IR, true);
        }

        @TestMetadata("beforeGotoToWhileStart.kt")
        public void testBeforeGotoToWhileStart() throws Exception {
            runTest("compiler/testData/lineNumber/custom/beforeGotoToWhileStart.kt");
        }

        @TestMetadata("callWithCallInArguments.kt")
        public void testCallWithCallInArguments() throws Exception {
            runTest("compiler/testData/lineNumber/custom/callWithCallInArguments.kt");
        }

        @TestMetadata("callWithReceiver.kt")
        public void testCallWithReceiver() throws Exception {
            runTest("compiler/testData/lineNumber/custom/callWithReceiver.kt");
        }

        @TestMetadata("chainCall.kt")
        public void testChainCall() throws Exception {
            runTest("compiler/testData/lineNumber/custom/chainCall.kt");
        }

        @TestMetadata("compileTimeConstant.kt")
        public void testCompileTimeConstant() throws Exception {
            runTest("compiler/testData/lineNumber/custom/compileTimeConstant.kt");
        }

        @TestMetadata("functionCallWithDefault.kt")
        public void testFunctionCallWithDefault() throws Exception {
            runTest("compiler/testData/lineNumber/custom/functionCallWithDefault.kt");
        }

        @TestMetadata("functionCallWithInlinedLambdaParam.kt")
        public void testFunctionCallWithInlinedLambdaParam() throws Exception {
            runTest("compiler/testData/lineNumber/custom/functionCallWithInlinedLambdaParam.kt");
        }

        @TestMetadata("functionCallWithLambdaParam.kt")
        public void testFunctionCallWithLambdaParam() throws Exception {
            runTest("compiler/testData/lineNumber/custom/functionCallWithLambdaParam.kt");
        }

        @TestMetadata("ifThen.kt")
        public void testIfThen() throws Exception {
            runTest("compiler/testData/lineNumber/custom/ifThen.kt");
        }

        @TestMetadata("ifThenElse.kt")
        public void testIfThenElse() throws Exception {
            runTest("compiler/testData/lineNumber/custom/ifThenElse.kt");
        }

        @TestMetadata("inTheEndOfLambdaArgumentOfInlineCall.kt")
        public void testInTheEndOfLambdaArgumentOfInlineCall() throws Exception {
            runTest("compiler/testData/lineNumber/custom/inTheEndOfLambdaArgumentOfInlineCall.kt");
        }

        @TestMetadata("multilineFunctionCall.kt")
        public void testMultilineFunctionCall() throws Exception {
            runTest("compiler/testData/lineNumber/custom/multilineFunctionCall.kt");
        }

        @TestMetadata("multilineInfixCall.kt")
        public void testMultilineInfixCall() throws Exception {
            runTest("compiler/testData/lineNumber/custom/multilineInfixCall.kt");
        }

        @TestMetadata("noParametersArgumentCallInExpression.kt")
        public void testNoParametersArgumentCallInExpression() throws Exception {
            runTest("compiler/testData/lineNumber/custom/noParametersArgumentCallInExpression.kt");
        }

        @TestMetadata("smapInlineAsArgument.kt")
        public void testSmapInlineAsArgument() throws Exception {
            runTest("compiler/testData/lineNumber/custom/smapInlineAsArgument.kt");
        }

        @TestMetadata("smapInlineAsInfixArgument.kt")
        public void testSmapInlineAsInfixArgument() throws Exception {
            runTest("compiler/testData/lineNumber/custom/smapInlineAsInfixArgument.kt");
        }

        @TestMetadata("smapInlineAsInlineArgument.kt")
        public void testSmapInlineAsInlineArgument() throws Exception {
            runTest("compiler/testData/lineNumber/custom/smapInlineAsInlineArgument.kt");
        }

        @TestMetadata("smapInlineInIntrinsicArgument.kt")
        public void testSmapInlineInIntrinsicArgument() throws Exception {
            runTest("compiler/testData/lineNumber/custom/smapInlineInIntrinsicArgument.kt");
        }

        @TestMetadata("tryCatchExpression.kt")
        public void testTryCatchExpression() throws Exception {
            runTest("compiler/testData/lineNumber/custom/tryCatchExpression.kt");
        }

        @TestMetadata("tryCatchFinally.kt")
        public void testTryCatchFinally() throws Exception {
            runTest("compiler/testData/lineNumber/custom/tryCatchFinally.kt");
        }

        @TestMetadata("tryFinally.kt")
        public void testTryFinally() throws Exception {
            runTest("compiler/testData/lineNumber/custom/tryFinally.kt");
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            runTest("compiler/testData/lineNumber/custom/when.kt");
        }

        @TestMetadata("whenSubject.kt")
        public void testWhenSubject() throws Exception {
            runTest("compiler/testData/lineNumber/custom/whenSubject.kt");
        }
    }
}
