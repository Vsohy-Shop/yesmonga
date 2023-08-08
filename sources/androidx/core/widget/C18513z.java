package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18274k;
import androidx.core.view.C18424y1;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.widget.z */
public final class C18513z implements C18424y1 {

    /* renamed from: a */
    public static final String f47290a = "ReceiveContent";

    @C0376v0(16)
    /* renamed from: androidx.core.widget.z$a */
    public static final class C18514a {
        /* renamed from: a */
        public static CharSequence m83802a(@C0359n0 Context context, @C0359n0 ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    /* renamed from: androidx.core.widget.z$b */
    public static final class C18515b {
        /* renamed from: a */
        public static CharSequence m83803a(@C0359n0 Context context, @C0359n0 ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            if ((i & 1) == 0 || !(coerceToText instanceof Spanned)) {
                return coerceToText;
            }
            return coerceToText.toString();
        }
    }

    /* renamed from: b */
    public static CharSequence m83799b(@C0359n0 Context context, @C0359n0 ClipData.Item item, int i) {
        return C18514a.m83802a(context, item, i);
    }

    /* renamed from: c */
    public static void m83800c(@C0359n0 Editable editable, @C0359n0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @C0363p0
    /* renamed from: a */
    public C18274k mo53098a(@C0359n0 View view, @C0359n0 C18274k kVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(kVar);
        }
        if (kVar.mo52937g() == 2) {
            return kVar;
        }
        ClipData c = kVar.mo52933c();
        int e = kVar.mo52935e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            CharSequence b = m83799b(context, c.getItemAt(i), e);
            if (b != null) {
                if (!z) {
                    m83800c(editable, b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b);
                }
            }
        }
        return null;
    }
}
