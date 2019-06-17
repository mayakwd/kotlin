/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.spring.tests.references;

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
@TestMetadata("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringReferenceCompletionHandlerTestGenerated extends AbstractSpringReferenceCompletionHandlerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInHandler() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("packageReferenceEnter.kt")
    public void testPackageReferenceEnter() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/packageReferenceEnter.kt");
    }

    @TestMetadata("packageReferenceTab.kt")
    public void testPackageReferenceTab() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/packageReferenceTab.kt");
    }

    @TestMetadata("qualifierReferenceEnter.kt")
    public void testQualifierReferenceEnter() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/qualifierReferenceEnter.kt");
    }

    @TestMetadata("qualifierReferenceTab.kt")
    public void testQualifierReferenceTab() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/qualifierReferenceTab.kt");
    }

    @TestMetadata("scopeReference.kt")
    public void testScopeReference() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/scopeReference.kt");
    }

    @TestMetadata("springBeanReferenceEnter.kt")
    public void testSpringBeanReferenceEnter() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/springBeanReferenceEnter.kt");
    }

    @TestMetadata("springBeanReferenceTab.kt")
    public void testSpringBeanReferenceTab() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/completion/handler/springBeanReferenceTab.kt");
    }
}
