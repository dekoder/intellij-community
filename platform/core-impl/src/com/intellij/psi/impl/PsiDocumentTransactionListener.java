/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * @author max
 */
package com.intellij.psi.impl;

import com.intellij.openapi.editor.Document;
import com.intellij.psi.PsiFile;
import com.intellij.util.messages.Topic;
import org.jetbrains.annotations.NotNull;

public interface PsiDocumentTransactionListener {
  Topic<PsiDocumentTransactionListener> TOPIC = new Topic<PsiDocumentTransactionListener>("psi.DocumentTransactionListener", PsiDocumentTransactionListener.class, Topic.BroadcastDirection.TO_PARENT);

  void transactionStarted(@NotNull Document document, @NotNull PsiFile file);
  void transactionCompleted(@NotNull Document document, @NotNull PsiFile file);
}
