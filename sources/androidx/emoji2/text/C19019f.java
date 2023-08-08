package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.C0323b0;
import androidx.annotation.C0328d;
import androidx.annotation.C0337f0;
import androidx.annotation.C0349j;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1869c;
import androidx.core.util.C18001r;
import androidx.emoji2.text.C19013d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@C0328d
/* renamed from: androidx.emoji2.text.f */
public class C19019f {

    /* renamed from: A */
    public static final int f48375A = 1;

    /* renamed from: B */
    public static final int f48376B = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: C */
    public static final int f48377C = Integer.MAX_VALUE;

    /* renamed from: D */
    public static final Object f48378D = new Object();

    /* renamed from: E */
    public static final Object f48379E = new Object();
    @C0363p0
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: F */
    public static volatile C19019f f48380F = null;
    @C0323b0("CONFIG_LOCK")

    /* renamed from: G */
    public static volatile boolean f48381G = false;

    /* renamed from: H */
    public static final String f48382H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: o */
    public static final String f48383o = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* renamed from: p */
    public static final String f48384p = "android.support.text.emoji.emojiCompat_replaceAll";

    /* renamed from: q */
    public static final int f48385q = 3;

    /* renamed from: r */
    public static final int f48386r = 0;

    /* renamed from: s */
    public static final int f48387s = 1;

    /* renamed from: t */
    public static final int f48388t = 2;

    /* renamed from: u */
    public static final int f48389u = 0;

    /* renamed from: v */
    public static final int f48390v = 1;

    /* renamed from: w */
    public static final int f48391w = 2;

    /* renamed from: x */
    public static final int f48392x = 0;

    /* renamed from: y */
    public static final int f48393y = 1;

    /* renamed from: z */
    public static final int f48394z = 0;
    @C0359n0

    /* renamed from: a */
    public final ReadWriteLock f48395a = new ReentrantReadWriteLock();
    @C0323b0("mInitLock")
    @C0359n0

    /* renamed from: b */
    public final Set<C19027g> f48396b;
    @C0323b0("mInitLock")

    /* renamed from: c */
    public volatile int f48397c = 3;
    @C0359n0

    /* renamed from: d */
    public final Handler f48398d;
    @C0359n0

    /* renamed from: e */
    public final C19023c f48399e;
    @C0359n0

    /* renamed from: f */
    public final C19030j f48400f;
    @C0359n0

    /* renamed from: g */
    public final C19033m f48401g;

    /* renamed from: h */
    public final boolean f48402h;

    /* renamed from: i */
    public final boolean f48403i;
    @C0363p0

    /* renamed from: j */
    public final int[] f48404j;

    /* renamed from: k */
    public final boolean f48405k;

    /* renamed from: l */
    public final int f48406l;

    /* renamed from: m */
    public final int f48407m;

    /* renamed from: n */
    public final C19026f f48408n;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.f$a */
    public @interface C19020a {
    }

    @C0376v0(19)
    /* renamed from: androidx.emoji2.text.f$b */
    public static final class C19021b extends C19023c {

        /* renamed from: b */
        public volatile C19084j f48409b;

        /* renamed from: c */
        public volatile C19105p f48410c;

        /* renamed from: androidx.emoji2.text.f$b$a */
        public class C19022a extends C19031k {
            public C19022a() {
            }

            /* renamed from: a */
            public void mo55940a(@C0363p0 Throwable th) {
                C19021b.this.f48412a.mo55972v(th);
            }

            /* renamed from: b */
            public void mo55941b(@C0359n0 C19105p pVar) {
                C19021b.this.mo55986j(pVar);
            }
        }

        public C19021b(C19019f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public String mo55977a() {
            String N = this.f48410c.mo56310g().mo56221N();
            return N == null ? "" : N;
        }

        /* renamed from: b */
        public int mo55978b(@C0359n0 CharSequence charSequence, int i) {
            return this.f48409b.mo56257b(charSequence, i);
        }

        /* renamed from: c */
        public int mo55979c(CharSequence charSequence, int i) {
            return this.f48409b.mo56259d(charSequence, i);
        }

        /* renamed from: d */
        public int mo55980d(@C0359n0 CharSequence charSequence, int i) {
            return this.f48409b.mo56260e(charSequence, i);
        }

        /* renamed from: e */
        public boolean mo55981e(@C0359n0 CharSequence charSequence) {
            return this.f48409b.mo56258c(charSequence) == 1;
        }

        /* renamed from: f */
        public boolean mo55982f(@C0359n0 CharSequence charSequence, int i) {
            return this.f48409b.mo56259d(charSequence, i) == 1;
        }

        /* renamed from: g */
        public void mo55983g() {
            try {
                this.f48412a.f48400f.mo55938a(new C19022a());
            } catch (Throwable th) {
                this.f48412a.mo55972v(th);
            }
        }

        /* renamed from: h */
        public CharSequence mo55984h(@C0359n0 CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f48409b.mo56263l(charSequence, i, i2, i3, z);
        }

        /* renamed from: i */
        public void mo55985i(@C0359n0 EditorInfo editorInfo) {
            editorInfo.extras.putInt(C19019f.f48383o, this.f48410c.mo56311h());
            editorInfo.extras.putBoolean(C19019f.f48384p, this.f48412a.f48402h);
        }

        /* renamed from: j */
        public void mo55986j(@C0359n0 C19105p pVar) {
            if (pVar == null) {
                this.f48412a.mo55972v(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f48410c = pVar;
            C19105p pVar2 = this.f48410c;
            C19033m a = this.f48412a.f48401g;
            C19026f b = this.f48412a.f48408n;
            C19019f fVar = this.f48412a;
            this.f48409b = new C19084j(pVar2, a, b, fVar.f48403i, fVar.f48404j, C19081i.m89340a());
            this.f48412a.mo55973w();
        }
    }

    /* renamed from: androidx.emoji2.text.f$c */
    public static class C19023c {

        /* renamed from: a */
        public final C19019f f48412a;

        public C19023c(C19019f fVar) {
            this.f48412a = fVar;
        }

        /* renamed from: a */
        public String mo55977a() {
            return "";
        }

        /* renamed from: b */
        public int mo55978b(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
            return -1;
        }

        /* renamed from: c */
        public int mo55979c(CharSequence charSequence, int i) {
            return 0;
        }

        /* renamed from: d */
        public int mo55980d(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
            return -1;
        }

        /* renamed from: e */
        public boolean mo55981e(@C0359n0 CharSequence charSequence) {
            return false;
        }

        /* renamed from: f */
        public boolean mo55982f(@C0359n0 CharSequence charSequence, int i) {
            return false;
        }

        /* renamed from: g */
        public void mo55983g() {
            this.f48412a.mo55973w();
        }

        /* renamed from: h */
        public CharSequence mo55984h(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3, boolean z) {
            return charSequence;
        }

        /* renamed from: i */
        public void mo55985i(@C0359n0 EditorInfo editorInfo) {
        }
    }

    /* renamed from: androidx.emoji2.text.f$d */
    public static abstract class C19024d {
        @C0359n0

        /* renamed from: a */
        public final C19030j f48413a;

        /* renamed from: b */
        public C19033m f48414b;

        /* renamed from: c */
        public boolean f48415c;

        /* renamed from: d */
        public boolean f48416d;
        @C0363p0

        /* renamed from: e */
        public int[] f48417e;
        @C0363p0

        /* renamed from: f */
        public Set<C19027g> f48418f;

        /* renamed from: g */
        public boolean f48419g;

        /* renamed from: h */
        public int f48420h = -16711936;

        /* renamed from: i */
        public int f48421i = 0;
        @C0359n0

        /* renamed from: j */
        public C19026f f48422j = new C19018e();

        public C19024d(@C0359n0 C19030j jVar) {
            C18001r.m81776m(jVar, "metadataLoader cannot be null.");
            this.f48413a = jVar;
        }

        @C0359n0
        /* renamed from: a */
        public final C19030j mo55987a() {
            return this.f48413a;
        }

        @C0359n0
        /* renamed from: b */
        public C19024d mo55988b(@C0359n0 C19027g gVar) {
            C18001r.m81776m(gVar, "initCallback cannot be null");
            if (this.f48418f == null) {
                this.f48418f = new C1869c();
            }
            this.f48418f.add(gVar);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C19024d mo55989c(@C0354l int i) {
            this.f48420h = i;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C19024d mo55990d(boolean z) {
            this.f48419g = z;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C19024d mo55991e(@C0359n0 C19026f fVar) {
            C18001r.m81776m(fVar, "GlyphChecker cannot be null");
            this.f48422j = fVar;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C19024d mo55992f(int i) {
            this.f48421i = i;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C19024d mo55993g(boolean z) {
            this.f48415c = z;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C19024d mo55994h(@C0359n0 C19033m mVar) {
            this.f48414b = mVar;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C19024d mo55995i(boolean z) {
            return mo55996j(z, (List<Integer>) null);
        }

        @C0359n0
        /* renamed from: j */
        public C19024d mo55996j(boolean z, @C0363p0 List<Integer> list) {
            this.f48416d = z;
            if (!z || list == null) {
                this.f48417e = null;
            } else {
                this.f48417e = new int[list.size()];
                int i = 0;
                for (Integer intValue : list) {
                    this.f48417e[i] = intValue.intValue();
                    i++;
                }
                Arrays.sort(this.f48417e);
            }
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C19024d mo55997k(@C0359n0 C19027g gVar) {
            C18001r.m81776m(gVar, "initCallback cannot be null");
            Set<C19027g> set = this.f48418f;
            if (set != null) {
                set.remove(gVar);
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.emoji2.text.f$e */
    public static class C19025e implements C19033m {
        @C0359n0
        @C0376v0(19)
        /* renamed from: a */
        public C19091k mo55998a(@C0359n0 C19109r rVar) {
            return new C19111s(rVar);
        }
    }

    /* renamed from: androidx.emoji2.text.f$f */
    public interface C19026f {
        /* renamed from: a */
        boolean mo55955a(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3);
    }

    /* renamed from: androidx.emoji2.text.f$g */
    public static abstract class C19027g {
        /* renamed from: a */
        public void mo3108a(@C0363p0 Throwable th) {
        }

        /* renamed from: b */
        public void mo3109b() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$h */
    public static class C19028h implements Runnable {

        /* renamed from: a */
        public final List<C19027g> f48423a;

        /* renamed from: b */
        public final Throwable f48424b;

        /* renamed from: c */
        public final int f48425c;

        public C19028h(@C0359n0 C19027g gVar, int i) {
            this(Arrays.asList(new C19027g[]{(C19027g) C18001r.m81776m(gVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        public void run() {
            int size = this.f48423a.size();
            int i = 0;
            if (this.f48425c != 1) {
                while (i < size) {
                    this.f48423a.get(i).mo3108a(this.f48424b);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f48423a.get(i).mo3109b();
                i++;
            }
        }

        public C19028h(@C0359n0 Collection<C19027g> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        public C19028h(@C0359n0 Collection<C19027g> collection, int i, @C0363p0 Throwable th) {
            C18001r.m81776m(collection, "initCallbacks cannot be null");
            this.f48423a = new ArrayList(collection);
            this.f48425c = i;
            this.f48424b = th;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.f$i */
    public @interface C19029i {
    }

    /* renamed from: androidx.emoji2.text.f$j */
    public interface C19030j {
        /* renamed from: a */
        void mo55938a(@C0359n0 C19031k kVar);
    }

    /* renamed from: androidx.emoji2.text.f$k */
    public static abstract class C19031k {
        /* renamed from: a */
        public abstract void mo55940a(@C0363p0 Throwable th);

        /* renamed from: b */
        public abstract void mo55941b(@C0359n0 C19105p pVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.emoji2.text.f$l */
    public @interface C19032l {
    }

    /* renamed from: androidx.emoji2.text.f$m */
    public interface C19033m {
        @C0359n0
        @C0376v0(19)
        /* renamed from: a */
        C19091k mo55998a(@C0359n0 C19109r rVar);
    }

    public C19019f(@C0359n0 C19024d dVar) {
        this.f48402h = dVar.f48415c;
        this.f48403i = dVar.f48416d;
        this.f48404j = dVar.f48417e;
        this.f48405k = dVar.f48419g;
        this.f48406l = dVar.f48420h;
        this.f48400f = dVar.f48413a;
        this.f48407m = dVar.f48421i;
        this.f48408n = dVar.f48422j;
        this.f48398d = new Handler(Looper.getMainLooper());
        C1869c cVar = new C1869c();
        this.f48396b = cVar;
        C19033m mVar = dVar.f48414b;
        this.f48401g = mVar == null ? new C19025e() : mVar;
        Set<C19027g> set = dVar.f48418f;
        if (set != null && !set.isEmpty()) {
            cVar.addAll(dVar.f48418f);
        }
        this.f48399e = new C19021b(this);
        mo55971u();
    }

    @C0359n0
    /* renamed from: C */
    public static C19019f m88859C(@C0359n0 C19024d dVar) {
        C19019f fVar;
        synchronized (f48378D) {
            fVar = new C19019f(dVar);
            f48380F = fVar;
        }
        return fVar;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: D */
    public static C19019f m88860D(@C0363p0 C19019f fVar) {
        C19019f fVar2;
        synchronized (f48378D) {
            f48380F = fVar;
            fVar2 = f48380F;
        }
        return fVar2;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: E */
    public static void m88861E(boolean z) {
        synchronized (f48379E) {
            f48381G = z;
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C19019f m88864c() {
        C19019f fVar;
        boolean z;
        synchronized (f48378D) {
            fVar = f48380F;
            if (fVar != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, f48382H);
        }
        return fVar;
    }

    /* renamed from: j */
    public static boolean m88865j(@C0359n0 InputConnection inputConnection, @C0359n0 Editable editable, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, boolean z) {
        return C19084j.m89344f(inputConnection, editable, i, i2, z);
    }

    /* renamed from: k */
    public static boolean m88866k(@C0359n0 Editable editable, int i, @C0359n0 KeyEvent keyEvent) {
        return C19084j.m89345g(editable, i, keyEvent);
    }

    @C0363p0
    /* renamed from: n */
    public static C19019f m88867n(@C0359n0 Context context) {
        return m88868o(context, (C19013d.C19014a) null);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: o */
    public static C19019f m88868o(@C0359n0 Context context, @C0363p0 C19013d.C19014a aVar) {
        C19019f fVar;
        if (f48381G) {
            return f48380F;
        }
        if (aVar == null) {
            aVar = new C19013d.C19014a((C19013d.C19015b) null);
        }
        C19024d c = aVar.mo55947c(context);
        synchronized (f48379E) {
            if (!f48381G) {
                if (c != null) {
                    m88869p(c);
                }
                f48381G = true;
            }
            fVar = f48380F;
        }
        return fVar;
    }

    @C0359n0
    /* renamed from: p */
    public static C19019f m88869p(@C0359n0 C19024d dVar) {
        C19019f fVar = f48380F;
        if (fVar == null) {
            synchronized (f48378D) {
                fVar = f48380F;
                if (fVar == null) {
                    fVar = new C19019f(dVar);
                    f48380F = fVar;
                }
            }
        }
        return fVar;
    }

    /* renamed from: q */
    public static boolean m88870q() {
        return f48380F != null;
    }

    @C0349j
    @C0363p0
    /* renamed from: A */
    public CharSequence mo55956A(@C0363p0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C18001r.m81778o(mo55969s(), "Not initialized yet");
        C18001r.m81773j(i, "start cannot be negative");
        C18001r.m81773j(i2, "end cannot be negative");
        C18001r.m81773j(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81765b(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C18001r.m81765b(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C18001r.m81765b(z3, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z5 = this.f48402h;
            }
            z4 = z5;
        } else {
            z4 = true;
        }
        return this.f48399e.mo55984h(charSequence, i, i2, i3, z4);
    }

    /* renamed from: B */
    public void mo55957B(@C0359n0 C19027g gVar) {
        C18001r.m81776m(gVar, "initCallback cannot be null");
        this.f48395a.writeLock().lock();
        try {
            if (this.f48397c != 1) {
                if (this.f48397c != 2) {
                    this.f48396b.add(gVar);
                }
            }
            this.f48398d.post(new C19028h(gVar, this.f48397c));
        } finally {
            this.f48395a.writeLock().unlock();
        }
    }

    /* renamed from: F */
    public void mo55958F(@C0359n0 C19027g gVar) {
        C18001r.m81776m(gVar, "initCallback cannot be null");
        this.f48395a.writeLock().lock();
        try {
            this.f48396b.remove(gVar);
        } finally {
            this.f48395a.writeLock().unlock();
        }
    }

    /* renamed from: G */
    public void mo55959G(@C0359n0 EditorInfo editorInfo) {
        if (mo55969s() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f48399e.mo55985i(editorInfo);
        }
    }

    @C0359n0
    /* renamed from: d */
    public String mo55960d() {
        C18001r.m81778o(mo55969s(), "Not initialized yet");
        return this.f48399e.mo55977a();
    }

    /* renamed from: e */
    public int mo55961e(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        return this.f48399e.mo55978b(charSequence, i);
    }

    /* renamed from: f */
    public int mo55962f(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        C18001r.m81778o(mo55969s(), "Not initialized yet");
        C18001r.m81776m(charSequence, "sequence cannot be null");
        return this.f48399e.mo55979c(charSequence, i);
    }

    @C0354l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public int mo55963g() {
        return this.f48406l;
    }

    /* renamed from: h */
    public int mo55964h(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        return this.f48399e.mo55980d(charSequence, i);
    }

    /* renamed from: i */
    public int mo55965i() {
        this.f48395a.readLock().lock();
        try {
            return this.f48397c;
        } finally {
            this.f48395a.readLock().unlock();
        }
    }

    @Deprecated
    /* renamed from: l */
    public boolean mo55966l(@C0359n0 CharSequence charSequence) {
        C18001r.m81778o(mo55969s(), "Not initialized yet");
        C18001r.m81776m(charSequence, "sequence cannot be null");
        return this.f48399e.mo55981e(charSequence);
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo55967m(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        C18001r.m81778o(mo55969s(), "Not initialized yet");
        C18001r.m81776m(charSequence, "sequence cannot be null");
        return this.f48399e.mo55982f(charSequence, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public boolean mo55968r() {
        return this.f48405k;
    }

    /* renamed from: s */
    public final boolean mo55969s() {
        return mo55965i() == 1;
    }

    /* renamed from: t */
    public void mo55970t() {
        boolean z = true;
        if (this.f48407m != 1) {
            z = false;
        }
        C18001r.m81778o(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!mo55969s()) {
            this.f48395a.writeLock().lock();
            try {
                if (this.f48397c != 0) {
                    this.f48397c = 0;
                    this.f48395a.writeLock().unlock();
                    this.f48399e.mo55983g();
                }
            } finally {
                this.f48395a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    public final void mo55971u() {
        this.f48395a.writeLock().lock();
        try {
            if (this.f48407m == 0) {
                this.f48397c = 0;
            }
            this.f48395a.writeLock().unlock();
            if (mo55965i() == 0) {
                this.f48399e.mo55983g();
            }
        } catch (Throwable th) {
            this.f48395a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public void mo55972v(@C0363p0 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f48395a.writeLock().lock();
        try {
            this.f48397c = 2;
            arrayList.addAll(this.f48396b);
            this.f48396b.clear();
            this.f48395a.writeLock().unlock();
            this.f48398d.post(new C19028h(arrayList, this.f48397c, th));
        } catch (Throwable th2) {
            this.f48395a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w */
    public void mo55973w() {
        ArrayList arrayList = new ArrayList();
        this.f48395a.writeLock().lock();
        try {
            this.f48397c = 1;
            arrayList.addAll(this.f48396b);
            this.f48396b.clear();
            this.f48395a.writeLock().unlock();
            this.f48398d.post(new C19028h((Collection<C19027g>) arrayList, this.f48397c));
        } catch (Throwable th) {
            this.f48395a.writeLock().unlock();
            throw th;
        }
    }

    @C0349j
    @C0363p0
    /* renamed from: x */
    public CharSequence mo55974x(@C0363p0 CharSequence charSequence) {
        int i;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        return mo55975y(charSequence, 0, i);
    }

    @C0349j
    @C0363p0
    /* renamed from: y */
    public CharSequence mo55975y(@C0363p0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2) {
        return mo55976z(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @C0349j
    @C0363p0
    /* renamed from: z */
    public CharSequence mo55976z(@C0363p0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3) {
        return mo55956A(charSequence, i, i2, i3, 0);
    }
}
