package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.lifecycle.LiveData;
import androidx.work.impl.C21191g0;
import com.google.common.util.concurrent.C32487a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* renamed from: B */
    public static void m97471B(@C0359n0 Context context, @C0359n0 C21082a aVar) {
        C21191g0.m97934B(context, aVar);
    }

    /* renamed from: C */
    public static boolean m97472C() {
        return C21191g0.m97935C();
    }

    @C0359n0
    @Deprecated
    /* renamed from: p */
    public static WorkManager m97473p() {
        C21191g0 I = C21191g0.m97936I();
        if (I != null) {
            return I;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @C0359n0
    /* renamed from: q */
    public static WorkManager m97474q(@C0359n0 Context context) {
        return C21191g0.m97937J(context);
    }

    @C0359n0
    /* renamed from: A */
    public abstract LiveData<List<WorkInfo>> mo63048A(@C0359n0 C21412v vVar);

    @C0359n0
    /* renamed from: D */
    public abstract C21397o mo63049D();

    @C0359n0
    /* renamed from: E */
    public abstract C32487a<UpdateResult> mo63050E(@C0359n0 C21414w wVar);

    @C0359n0
    /* renamed from: a */
    public final C21411u mo63051a(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 C21379m mVar) {
        return mo63052b(str, existingWorkPolicy, Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: b */
    public abstract C21411u mo63052b(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: c */
    public final C21411u mo63053c(@C0359n0 C21379m mVar) {
        return mo63054d(Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: d */
    public abstract C21411u mo63054d(@C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: e */
    public abstract C21397o mo63055e();

    @C0359n0
    /* renamed from: f */
    public abstract C21397o mo63056f(@C0359n0 String str);

    @C0359n0
    /* renamed from: g */
    public abstract C21397o mo63057g(@C0359n0 String str);

    @C0359n0
    /* renamed from: h */
    public abstract C21397o mo63058h(@C0359n0 UUID uuid);

    @C0359n0
    /* renamed from: i */
    public abstract PendingIntent mo63059i(@C0359n0 UUID uuid);

    @C0359n0
    /* renamed from: j */
    public final C21397o mo63060j(@C0359n0 C21414w wVar) {
        return mo63061k(Collections.singletonList(wVar));
    }

    @C0359n0
    /* renamed from: k */
    public abstract C21397o mo63061k(@C0359n0 List<? extends C21414w> list);

    @C0359n0
    /* renamed from: l */
    public abstract C21397o mo63062l(@C0359n0 String str, @C0359n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @C0359n0 C21403p pVar);

    @C0359n0
    /* renamed from: m */
    public C21397o mo63063m(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 C21379m mVar) {
        return mo63064n(str, existingWorkPolicy, Collections.singletonList(mVar));
    }

    @C0359n0
    /* renamed from: n */
    public abstract C21397o mo63064n(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list);

    @C0359n0
    /* renamed from: o */
    public abstract C21082a mo63065o();

    @C0359n0
    /* renamed from: r */
    public abstract C32487a<Long> mo63066r();

    @C0359n0
    /* renamed from: s */
    public abstract LiveData<Long> mo63067s();

    @C0359n0
    /* renamed from: t */
    public abstract C32487a<WorkInfo> mo63068t(@C0359n0 UUID uuid);

    @C0359n0
    /* renamed from: u */
    public abstract LiveData<WorkInfo> mo63069u(@C0359n0 UUID uuid);

    @C0359n0
    /* renamed from: v */
    public abstract C32487a<List<WorkInfo>> mo63070v(@C0359n0 C21412v vVar);

    @C0359n0
    /* renamed from: w */
    public abstract C32487a<List<WorkInfo>> mo63071w(@C0359n0 String str);

    @C0359n0
    /* renamed from: x */
    public abstract LiveData<List<WorkInfo>> mo63072x(@C0359n0 String str);

    @C0359n0
    /* renamed from: y */
    public abstract C32487a<List<WorkInfo>> mo63073y(@C0359n0 String str);

    @C0359n0
    /* renamed from: z */
    public abstract LiveData<List<WorkInfo>> mo63074z(@C0359n0 String str);
}
