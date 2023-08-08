package com.carrefour.fid.android.various.core.initializer;

import android.content.Context;
import androidx.startup.C20496b;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9848g;
import com.usabilla.sdk.ubform.Usabilla;
import com.usabilla.sdk.ubform.net.http.C9870g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/core/initializer/UsabillaInitializer;", "Landroidx/startup/b;", "Lkotlin/d2;", "Landroid/content/Context;", "context", "b", "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class UsabillaInitializer implements C20496b<C11079d2> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo55933a(Context context) {
        mo67147b(context);
        return C11079d2.f28267a;
    }

    /* renamed from: b */
    public void mo67147b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Usabilla.initialize$default(Usabilla.f26653a, context, C22754a.f58270a, (C9870g) null, (C9848g) null, 12, (Object) null);
    }

    @C12579k
    public List<Class<? extends C20496b<?>>> dependencies() {
        return new ArrayList();
    }
}
