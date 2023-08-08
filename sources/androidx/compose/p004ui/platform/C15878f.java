package androidx.compose.p004ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import androidx.compose.p004ui.text.C16156d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.f */
public final class C15878f implements C15912k0 {
    @C12579k

    /* renamed from: a */
    public final ClipboardManager f39529a;

    public C15878f(@C12579k ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.f39529a = clipboardManager;
    }

    @C12580l
    /* renamed from: a */
    public C16156d mo45722a() {
        ClipData primaryClip = this.f39529a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return C15884g.m71349a(charSequence);
    }

    /* renamed from: b */
    public boolean mo45723b() {
        ClipDescription primaryClipDescription = this.f39529a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* renamed from: c */
    public void mo45724c(@C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        this.f39529a.setPrimaryClip(ClipData.newPlainText(C15884g.f39541a, C15884g.m71350b(dVar)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15878f(@org.jetbrains.annotations.C12579k android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C15878f.<init>(android.content.Context):void");
    }
}
