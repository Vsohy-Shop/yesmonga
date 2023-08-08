package androidx.compose.p004ui.focus;

import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.t */
public final class C15080t {
    @C12579k

    /* renamed from: a */
    public static final String f37245a = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";
    @C12579k

    /* renamed from: b */
    public static final String f37246b = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";
}
