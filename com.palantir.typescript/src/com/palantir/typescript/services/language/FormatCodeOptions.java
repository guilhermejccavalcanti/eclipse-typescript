/*
 * Copyright 2013 Palantir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.typescript.services.language;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 * Corresponds to the class with the same name in languageService.ts.
 *
 * @author dcicerone
 */
public final class FormatCodeOptions extends EditorOptions {

    @JsonProperty("InsertSpaceAfterCommaDelimiter")
    private boolean insertSpaceAfterCommaDelimiter;

    @JsonProperty("InsertSpaceAfterSemicolonInForStatements")
    private boolean insertSpaceAfterSemicolonInForStatements;

    @JsonProperty("InsertSpaceBeforeAndAfterBinaryOperators")
    private boolean insertSpaceBeforeAndAfterBinaryOperators;

    @JsonProperty("InsertSpaceAfterKeywordsInControlFlowStatements")
    private boolean insertSpaceAfterKeywordsInControlFlowStatements;

    @JsonProperty("InsertSpaceAfterFunctionKeywordForAnonymousFunctions")
    private boolean insertSpaceAfterFunctionKeywordForAnonymousFunctions;

    @JsonProperty("InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")
    private boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;

    @JsonProperty("PlaceOpenBraceOnNewLineForFunctions")
    private boolean placeOpenBraceOnNewLineForFunctions;

    @JsonProperty("PlaceOpenBraceOnNewLineForControlBlocks")
    private boolean placeOpenBraceOnNewLineForControlBlocks;

    public FormatCodeOptions(
            int indentSize,
            int tabSize,
            boolean convertTabsToSpaces,
            IndentStyle indentStyle,
            boolean insertSpaceAfterCommaDelimiter,
            boolean insertSpaceAfterSemicolonInForStatements,
            boolean insertSpaceBeforeAndAfterBinaryOperators,
            boolean insertSpaceAfterKeywordsInControlFlowStatements,
            boolean insertSpaceAfterFunctionKeywordForAnonymousFunctions,
            boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis,
            boolean placeOpenBraceOnNewLineForFunctions,
            boolean placeOpenBraceOnNewLineForControlBlocks) {
        super(indentSize, tabSize, convertTabsToSpaces, indentStyle);

        this.insertSpaceAfterCommaDelimiter = insertSpaceAfterCommaDelimiter;
        this.insertSpaceAfterSemicolonInForStatements = insertSpaceAfterSemicolonInForStatements;
        this.insertSpaceBeforeAndAfterBinaryOperators = insertSpaceBeforeAndAfterBinaryOperators;
        this.insertSpaceAfterKeywordsInControlFlowStatements = insertSpaceAfterKeywordsInControlFlowStatements;
        this.insertSpaceAfterFunctionKeywordForAnonymousFunctions = insertSpaceAfterFunctionKeywordForAnonymousFunctions;
        this.insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;
        this.placeOpenBraceOnNewLineForFunctions = placeOpenBraceOnNewLineForFunctions;
        this.placeOpenBraceOnNewLineForControlBlocks = placeOpenBraceOnNewLineForControlBlocks;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("indentSize", this.getIndentSize())
            .add("tabSize", this.getTabSize())
            .add("newLineCharacter", NEW_LINE_ESCAPER.escape(this.getNewLineCharacter()))
            .add("convertTabsToSpaces", this.getConvertTabsToSpaces())
            .add("indentStyle", this.getIndentStyle())
            .add("insertSpaceAfterCommaDelimiter", this.insertSpaceAfterCommaDelimiter)
            .add("insertSpaceAfterSemicolonInForStatements", this.insertSpaceAfterSemicolonInForStatements)
            .add("insertSpaceBeforeAndAfterBinaryOperators", this.insertSpaceBeforeAndAfterBinaryOperators)
            .add("insertSpaceAfterKeywordsInControlFlowStatements", this.insertSpaceAfterKeywordsInControlFlowStatements)
            .add("insertSpaceAfterFunctionKeywordForAnonymousFunctions", this.insertSpaceAfterFunctionKeywordForAnonymousFunctions)
            .add("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis",
                this.insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis)
            .add("placeOpenBraceOnNewLineForFunctions", this.placeOpenBraceOnNewLineForFunctions)
            .add("placeOpenBraceOnNewLineForControlBlocks", this.placeOpenBraceOnNewLineForControlBlocks)
            .toString();
    }
}
