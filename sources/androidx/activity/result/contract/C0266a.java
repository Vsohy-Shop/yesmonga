package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.result.contract.a */
public abstract class C0266a<I, O> {

    /* renamed from: androidx.activity.result.contract.a$a */
    public static final class C0267a<T> {

        /* renamed from: a */
        public final T f799a;

        public C0267a(T t) {
            this.f799a = t;
        }

        /* renamed from: a */
        public final T mo899a() {
            return this.f799a;
        }
    }

    @C12579k
    /* renamed from: a */
    public abstract Intent mo869a(@C12579k Context context, I i);

    @C12580l
    /* renamed from: b */
    public C0267a<O> mo898b(@C12579k Context context, I i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return null;
    }

    /* renamed from: c */
    public abstract O mo870c(int i, @C12580l Intent intent);
}
