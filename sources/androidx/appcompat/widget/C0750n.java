package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18274k;

/* renamed from: androidx.appcompat.widget.n */
public final class C0750n {

    /* renamed from: a */
    public static final String f2465a = "ReceiveContent";

    @C0376v0(24)
    /* renamed from: androidx.appcompat.widget.n$a */
    public static final class C0751a {
        /* JADX INFO: finally extract failed */
        @C0373u
        /* renamed from: a */
        public static boolean m3693a(@C0359n0 DragEvent dragEvent, @C0359n0 TextView textView, @C0359n0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C18196h2.m82606m1(textView, new C18274k.C18276b(dragEvent.getClipData(), 3).mo52941a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @C0373u
        /* renamed from: b */
        public static boolean m3694b(@C0359n0 DragEvent dragEvent, @C0359n0 View view, @C0359n0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C18196h2.m82606m1(view, new C18274k.C18276b(dragEvent.getClipData(), 3).mo52941a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m3690a(@C0359n0 View view, @C0359n0 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C18196h2.m82585h0(view) != null) {
            Activity c = m3692c(view);
            if (c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C0751a.m3693a(dragEvent, (TextView) view, c);
                    }
                    return C0751a.m3694b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3691b(@C0359n0 TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C18196h2.m82585h0(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            C18274k.C18276b bVar = new C18274k.C18276b(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C18196h2.m82606m1(textView, bVar.mo52944d(i2).mo52941a());
        }
        return true;
    }

    @C0363p0
    /* renamed from: c */
    public static Activity m3692c(@C0359n0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
