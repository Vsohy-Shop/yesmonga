package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C19441m0;
import androidx.startup.C20495a;
import androidx.startup.C20496b;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, mo22516d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/b;", "Landroidx/lifecycle/w;", "Landroid/content/Context;", "context", "b", "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "lifecycle-process_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements C20496b<C19499w> {
    @C12579k
    /* renamed from: b */
    public C19499w mo55933a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C20495a e = C20495a.m95528e(context);
        Intrinsics.checkNotNullExpressionValue(e, "getInstance(context)");
        if (e.mo61440g(ProcessLifecycleInitializer.class)) {
            C19466s.m90789a(context);
            C19441m0.C19443b bVar = C19441m0.f49815w;
            bVar.mo57610c(context);
            return bVar.mo57609a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @C12579k
    public List<Class<? extends C20496b<?>>> dependencies() {
        return CollectionsKt__CollectionsKt.m40441E();
    }
}
