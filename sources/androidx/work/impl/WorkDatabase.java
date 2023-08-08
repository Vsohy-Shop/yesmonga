package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.C20294e;
import androidx.room.C20316h;
import androidx.room.C20319h2;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.p031db.framework.C20477e;
import androidx.work.C21091d;
import androidx.work.impl.model.C21207a;
import androidx.work.impl.model.C21211b;
import androidx.work.impl.model.C21212b0;
import androidx.work.impl.model.C21221d;
import androidx.work.impl.model.C21222e;
import androidx.work.impl.model.C21226g;
import androidx.work.impl.model.C21229i;
import androidx.work.impl.model.C21230j;
import androidx.work.impl.model.C21238n;
import androidx.work.impl.model.C21239o;
import androidx.work.impl.model.C21242q;
import androidx.work.impl.model.C21243r;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21274y;
import androidx.work.impl.model.C21275z;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.concurrent.Executor;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20316h(autoMigrations = {@C20294e(from = 13, mo61008to = 14), @C20294e(from = 14, spec = C21102b.class, mo61008to = 15)}, entities = {C21207a.class, C21249u.class, C21274y.class, C21229i.class, C21238n.class, C21242q.class, C21221d.class}, version = 16)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0016"}, mo22516d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "Landroidx/work/impl/model/v;", "X", "Landroidx/work/impl/model/b;", "R", "Landroidx/work/impl/model/z;", "Y", "Landroidx/work/impl/model/j;", "U", "Landroidx/work/impl/model/o;", "V", "Landroidx/work/impl/model/r;", "W", "Landroidx/work/impl/model/e;", "S", "Landroidx/work/impl/model/g;", "T", "<init>", "()V", "q", "a", "work-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
@C20319h2({C21091d.class, C21212b0.class})
public abstract class WorkDatabase extends RoomDatabase {
    @C12579k

    /* renamed from: q */
    public static final C21098a f54450q = new C21098a((DefaultConstructorMarker) null);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    public static final class C21098a {
        public /* synthetic */ C21098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static final C20481g m97644c(Context context, C20481g.C20484b bVar) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(bVar, BannerConfigurableFragment.f27258E0);
            C20481g.C20484b.C20485a a = C20481g.C20484b.f52799f.mo61414a(context);
            a.mo61412d(bVar.f52801b).mo61411c(bVar.f52802c).mo61413e(true).mo61409a(true);
            return new C20477e().mo18120a(a.mo61410b());
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final WorkDatabase mo63209b(@C12579k Context context, @C12579k Executor executor, boolean z) {
            RoomDatabase.C20270a<WorkDatabase> aVar;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(executor, "queryExecutor");
            Class<WorkDatabase> cls = WorkDatabase.class;
            if (z) {
                aVar = C20366s1.m95113c(context, cls).mo60925e();
            } else {
                aVar = C20366s1.m95111a(context, cls, C21136c0.f54584b).mo60937q(new C21368y(context));
            }
            return aVar.mo60942v(executor).mo60922b(C21135c.f54582a).mo60923c(C21197i.f54710c).mo60923c(new C21288s(context, 2, 3)).mo60923c(C21199j.f54711c).mo60923c(C21201k.f54719c).mo60923c(new C21288s(context, 5, 6)).mo60923c(C21203l.f54723c).mo60923c(C21205m.f54729c).mo60923c(C21277n.f54872c).mo60923c(new C21196h0(context)).mo60923c(new C21288s(context, 10, 11)).mo60923c(C21178f.f54646c).mo60923c(C21190g.f54685c).mo60923c(C21195h.f54708c).mo60934n().mo60926f();
        }

        public C21098a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: Q */
    public static final WorkDatabase m97634Q(@C12579k Context context, @C12579k Executor executor, boolean z) {
        return f54450q.mo63209b(context, executor, z);
    }

    @C12579k
    /* renamed from: R */
    public abstract C21211b mo63201R();

    @C12579k
    /* renamed from: S */
    public abstract C21222e mo63202S();

    @C12579k
    /* renamed from: T */
    public abstract C21226g mo63203T();

    @C12579k
    /* renamed from: U */
    public abstract C21230j mo63204U();

    @C12579k
    /* renamed from: V */
    public abstract C21239o mo63205V();

    @C12579k
    /* renamed from: W */
    public abstract C21243r mo63206W();

    @C12579k
    /* renamed from: X */
    public abstract C21253v mo63207X();

    @C12579k
    /* renamed from: Y */
    public abstract C21275z mo63208Y();
}
