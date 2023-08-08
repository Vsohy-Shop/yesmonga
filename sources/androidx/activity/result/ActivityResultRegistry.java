package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.C0266a;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.app.C17125i;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: i */
    public static final String f760i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: j */
    public static final String f761j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: k */
    public static final String f762k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: l */
    public static final String f763l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: m */
    public static final String f764m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: n */
    public static final String f765n = "ActivityResultRegistry";

    /* renamed from: o */
    public static final int f766o = 65536;

    /* renamed from: a */
    public Random f767a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f768b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f769c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0258d> f770d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f771e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0257c<?>> f772f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f773g = new HashMap();

    /* renamed from: h */
    public final Bundle f774h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0255a extends C0302g<I> {

        /* renamed from: a */
        public final /* synthetic */ String f779a;

        /* renamed from: b */
        public final /* synthetic */ C0266a f780b;

        public C0255a(String str, C0266a aVar) {
            this.f779a = str;
            this.f780b = aVar;
        }

        @C0359n0
        /* renamed from: a */
        public C0266a<I, ?> mo820a() {
            return this.f780b;
        }

        /* renamed from: c */
        public void mo821c(I i, @C0363p0 C17125i iVar) {
            Integer num = ActivityResultRegistry.this.f769c.get(this.f779a);
            if (num != null) {
                ActivityResultRegistry.this.f771e.add(this.f779a);
                try {
                    ActivityResultRegistry.this.mo752f(num.intValue(), this.f780b, i, iVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f771e.remove(this.f779a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f780b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: d */
        public void mo822d() {
            ActivityResultRegistry.this.mo882l(this.f779a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0256b extends C0302g<I> {

        /* renamed from: a */
        public final /* synthetic */ String f782a;

        /* renamed from: b */
        public final /* synthetic */ C0266a f783b;

        public C0256b(String str, C0266a aVar) {
            this.f782a = str;
            this.f783b = aVar;
        }

        @C0359n0
        /* renamed from: a */
        public C0266a<I, ?> mo820a() {
            return this.f783b;
        }

        /* renamed from: c */
        public void mo821c(I i, @C0363p0 C17125i iVar) {
            Integer num = ActivityResultRegistry.this.f769c.get(this.f782a);
            if (num != null) {
                ActivityResultRegistry.this.f771e.add(this.f782a);
                try {
                    ActivityResultRegistry.this.mo752f(num.intValue(), this.f783b, i, iVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f771e.remove(this.f782a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f783b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: d */
        public void mo822d() {
            ActivityResultRegistry.this.mo882l(this.f782a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0257c<O> {

        /* renamed from: a */
        public final C0263a<O> f785a;

        /* renamed from: b */
        public final C0266a<?, O> f786b;

        public C0257c(C0263a<O> aVar, C0266a<?, O> aVar2) {
            this.f785a = aVar;
            this.f786b = aVar2;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0258d {

        /* renamed from: a */
        public final Lifecycle f787a;

        /* renamed from: b */
        public final ArrayList<C19470t> f788b = new ArrayList<>();

        public C0258d(@C0359n0 Lifecycle lifecycle) {
            this.f787a = lifecycle;
        }

        /* renamed from: a */
        public void mo883a(@C0359n0 C19470t tVar) {
            this.f787a.mo57464a(tVar);
            this.f788b.add(tVar);
        }

        /* renamed from: b */
        public void mo884b() {
            Iterator<C19470t> it = this.f788b.iterator();
            while (it.hasNext()) {
                this.f787a.mo57467d(it.next());
            }
            this.f788b.clear();
        }
    }

    /* renamed from: a */
    public final void mo872a(int i, String str) {
        this.f768b.put(Integer.valueOf(i), str);
        this.f769c.put(str, Integer.valueOf(i));
    }

    @C0353k0
    /* renamed from: b */
    public final boolean mo873b(int i, int i2, @C0363p0 Intent intent) {
        String str = this.f768b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        mo875d(str, i2, intent, this.f772f.get(str));
        return true;
    }

    @C0353k0
    /* renamed from: c */
    public final <O> boolean mo874c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        C0263a<O> aVar;
        String str = this.f768b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0257c cVar = this.f772f.get(str);
        if (cVar == null || (aVar = cVar.f785a) == null) {
            this.f774h.remove(str);
            this.f773g.put(str, o);
            return true;
        } else if (!this.f771e.remove(str)) {
            return true;
        } else {
            aVar.mo790a(o);
            return true;
        }
    }

    /* renamed from: d */
    public final <O> void mo875d(String str, int i, @C0363p0 Intent intent, @C0363p0 C0257c<O> cVar) {
        if (cVar == null || cVar.f785a == null || !this.f771e.contains(str)) {
            this.f773g.remove(str);
            this.f774h.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        cVar.f785a.mo790a(cVar.f786b.mo870c(i, intent));
        this.f771e.remove(str);
    }

    /* renamed from: e */
    public final int mo876e() {
        int nextInt = this.f767a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f768b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f767a.nextInt(2147418112);
        }
    }

    @C0353k0
    /* renamed from: f */
    public abstract <I, O> void mo752f(int i, @C0359n0 C0266a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i2, @C0363p0 C17125i iVar);

    /* renamed from: g */
    public final void mo877g(@C0363p0 Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f760i);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f761j);
            if (stringArrayList != null && integerArrayList != null) {
                this.f771e = bundle.getStringArrayList(f762k);
                this.f767a = (Random) bundle.getSerializable(f764m);
                this.f774h.putAll(bundle.getBundle(f763l));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f769c.containsKey(str)) {
                        Integer remove = this.f769c.remove(str);
                        if (!this.f774h.containsKey(str)) {
                            this.f768b.remove(remove);
                        }
                    }
                    mo872a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo878h(@C0359n0 Bundle bundle) {
        bundle.putIntegerArrayList(f760i, new ArrayList(this.f769c.values()));
        bundle.putStringArrayList(f761j, new ArrayList(this.f769c.keySet()));
        bundle.putStringArrayList(f762k, new ArrayList(this.f771e));
        bundle.putBundle(f763l, (Bundle) this.f774h.clone());
        bundle.putSerializable(f764m, this.f767a);
    }

    @C0359n0
    /* renamed from: i */
    public final <I, O> C0302g<I> mo879i(@C0359n0 String str, @C0359n0 C0266a<I, O> aVar, @C0359n0 C0263a<O> aVar2) {
        mo881k(str);
        this.f772f.put(str, new C0257c(aVar2, aVar));
        if (this.f773g.containsKey(str)) {
            Object obj = this.f773g.get(str);
            this.f773g.remove(str);
            aVar2.mo790a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f774h.getParcelable(str);
        if (activityResult != null) {
            this.f774h.remove(str);
            aVar2.mo790a(aVar.mo870c(activityResult.mo855b(), activityResult.mo854a()));
        }
        return new C0256b(str, aVar);
    }

    @C0359n0
    /* renamed from: j */
    public final <I, O> C0302g<I> mo880j(@C0359n0 final String str, @C0359n0 C19499w wVar, @C0359n0 final C0266a<I, O> aVar, @C0359n0 final C0263a<O> aVar2) {
        Lifecycle lifecycle = wVar.getLifecycle();
        if (!lifecycle.mo57465b().mo57474q(Lifecycle.State.STARTED)) {
            mo881k(str);
            C0258d dVar = this.f770d.get(str);
            if (dVar == null) {
                dVar = new C0258d(lifecycle);
            }
            dVar.mo883a(new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    if (Lifecycle.C19372Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f772f.put(str, new C0257c(aVar2, aVar));
                        if (ActivityResultRegistry.this.f773g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f773g.get(str);
                            ActivityResultRegistry.this.f773g.remove(str);
                            aVar2.mo790a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f774h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f774h.remove(str);
                            aVar2.mo790a(aVar.mo870c(activityResult.mo855b(), activityResult.mo854a()));
                        }
                    } else if (Lifecycle.C19372Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f772f.remove(str);
                    } else if (Lifecycle.C19372Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.mo882l(str);
                    }
                }
            });
            this.f770d.put(str, dVar);
            return new C0255a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + wVar + " is attempting to register while current state is " + lifecycle.mo57465b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: k */
    public final void mo881k(String str) {
        if (this.f769c.get(str) == null) {
            mo872a(mo876e(), str);
        }
    }

    @C0353k0
    /* renamed from: l */
    public final void mo882l(@C0359n0 String str) {
        Integer remove;
        if (!this.f771e.contains(str) && (remove = this.f769c.remove(str)) != null) {
            this.f768b.remove(remove);
        }
        this.f772f.remove(str);
        if (this.f773g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f773g.get(str));
            this.f773g.remove(str);
        }
        if (this.f774h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f774h.getParcelable(str));
            this.f774h.remove(str);
        }
        C0258d dVar = this.f770d.get(str);
        if (dVar != null) {
            dVar.mo884b();
            this.f770d.remove(str);
        }
    }
}
