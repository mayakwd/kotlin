/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.spring.tests.findUsages;

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
@TestMetadata("kotlin-ultimate/ultimate/testData/spring/core/findUsages")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringFindUsagesTestGenerated extends AbstractSpringFindUsagesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInFindUsages() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("kotlin-ultimate/ultimate/testData/spring/core/findUsages"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("classXml.kt")
    public void testClassXml() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/findUsages/classXml.kt");
    }

    @TestMetadata("primaryConstructorArgXml.kt")
    public void testPrimaryConstructorArgXml() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/findUsages/primaryConstructorArgXml.kt");
    }

    @TestMetadata("propertyXml.kt")
    public void testPropertyXml() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/findUsages/propertyXml.kt");
    }

    @TestMetadata("setterFunXml.kt")
    public void testSetterFunXml() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/findUsages/setterFunXml.kt");
    }
}
