package androidx.compose.p004ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.c0 */
public final class C15859c0 implements C16007z3 {

    /* renamed from: b */
    public static final int f39513b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f39514a;

    public C15859c0(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f39514a = context;
    }

    /* renamed from: a */
    public void mo45708a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uri");
        this.f39514a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
