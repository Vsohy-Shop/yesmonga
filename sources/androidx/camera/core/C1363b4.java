package androidx.camera.core;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1437b0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1495p1;
import androidx.camera.core.impl.C1503s0;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.C1613f;
import androidx.camera.core.internal.C1615g;
import androidx.camera.core.internal.utils.C1622b;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.camera.core.b4 */
public final class C1363b4 extends UseCase {

    /* renamed from: O */
    public static final int f3927O = 0;

    /* renamed from: P */
    public static final int f3928P = 1;

    /* renamed from: Q */
    public static final int f3929Q = 2;

    /* renamed from: R */
    public static final int f3930R = 3;

    /* renamed from: S */
    public static final int f3931S = 4;

    /* renamed from: T */
    public static final int f3932T = 5;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: U */
    public static final C1366c f3933U = new C1366c();

    /* renamed from: V */
    public static final String f3934V = "VideoCapture";

    /* renamed from: W */
    public static final int f3935W = 10000;

    /* renamed from: X */
    public static final String f3936X = "video/avc";

    /* renamed from: Y */
    public static final String f3937Y = "audio/mp4a-latm";

    /* renamed from: Z */
    public static final int[] f3938Z = {8, 6, 5, 4};

    /* renamed from: a0 */
    public static final short[] f3939a0 = {2, 3, 4};
    @C0323b0("mMuxerLock")

    /* renamed from: A */
    public MediaMuxer f3940A;

    /* renamed from: B */
    public boolean f3941B = false;

    /* renamed from: C */
    public int f3942C;

    /* renamed from: D */
    public int f3943D;

    /* renamed from: E */
    public Surface f3944E;
    @C0359n0

    /* renamed from: F */
    public AudioRecord f3945F;

    /* renamed from: G */
    public int f3946G;

    /* renamed from: H */
    public boolean f3947H = false;

    /* renamed from: I */
    public int f3948I;

    /* renamed from: J */
    public int f3949J;

    /* renamed from: K */
    public int f3950K;

    /* renamed from: L */
    public DeferrableSurface f3951L;

    /* renamed from: M */
    public Uri f3952M;

    /* renamed from: N */
    public ParcelFileDescriptor f3953N;

    /* renamed from: l */
    public final MediaCodec.BufferInfo f3954l = new MediaCodec.BufferInfo();

    /* renamed from: m */
    public final Object f3955m = new Object();

    /* renamed from: n */
    public final AtomicBoolean f3956n = new AtomicBoolean(true);

    /* renamed from: o */
    public final AtomicBoolean f3957o = new AtomicBoolean(true);

    /* renamed from: p */
    public final AtomicBoolean f3958p = new AtomicBoolean(true);

    /* renamed from: q */
    public final MediaCodec.BufferInfo f3959q = new MediaCodec.BufferInfo();

    /* renamed from: r */
    public final AtomicBoolean f3960r = new AtomicBoolean(false);

    /* renamed from: s */
    public final AtomicBoolean f3961s = new AtomicBoolean(false);

    /* renamed from: t */
    public HandlerThread f3962t;

    /* renamed from: u */
    public Handler f3963u;

    /* renamed from: v */
    public HandlerThread f3964v;

    /* renamed from: w */
    public Handler f3965w;
    @C0359n0

    /* renamed from: x */
    public MediaCodec f3966x;
    @C0359n0

    /* renamed from: y */
    public MediaCodec f3967y;
    @C0363p0

    /* renamed from: z */
    public C32487a<Void> f3968z = null;

    /* renamed from: androidx.camera.core.b4$a */
    public class C1364a implements SessionConfig.C1425c {

        /* renamed from: a */
        public final /* synthetic */ String f3969a;

        /* renamed from: b */
        public final /* synthetic */ Size f3970b;

        public C1364a(String str, Size size) {
            this.f3969a = str;
            this.f3970b = size;
        }

        /* renamed from: a */
        public void mo5030a(@C0359n0 SessionConfig sessionConfig, @C0359n0 SessionConfig.SessionError sessionError) {
            if (C1363b4.this.mo4962o(this.f3969a)) {
                C1363b4.this.mo5024k0(this.f3969a, this.f3970b);
                C1363b4.this.mo4966s();
            }
        }
    }

    /* renamed from: androidx.camera.core.b4$b */
    public static final class C1365b implements C1488o1.C1489a<C1363b4, C1495p1, C1365b>, C1491p0.C1492a<C1365b>, C1613f.C1614a<C1365b> {

        /* renamed from: a */
        public final C1586y0 f3972a;

        public C1365b() {
            this(C1586y0.m6573d0());
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: u */
        public static C1365b m5784u(@C0359n0 Config config) {
            return new C1365b(C1586y0.m6574e0(config));
        }

        @C0359n0
        /* renamed from: v */
        public static C1365b m5785v(@C0359n0 C1495p1 p1Var) {
            return new C1365b(C1586y0.m6574e0(p1Var));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: A */
        public C1365b mo5031A(int i) {
            mo4099h().mo5545t(C1495p1.f4267C, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: B */
        public C1365b mo5032B(int i) {
            mo4099h().mo5545t(C1495p1.f4265A, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: C */
        public C1365b mo5052e(@C0359n0 Executor executor) {
            mo4099h().mo5545t(C1613f.f4539t, executor);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: D */
        public C1365b mo5034D(int i) {
            mo4099h().mo5545t(C1495p1.f4270x, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: E */
        public C1365b mo4850a(@C0359n0 C1647n nVar) {
            mo4099h().mo5545t(C1488o1.f4255p, nVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: F */
        public C1365b mo4852c(@C0359n0 C1583y.C1585b bVar) {
            mo4099h().mo5545t(C1488o1.f4253n, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: G */
        public C1365b mo4865r(@C0359n0 C1583y yVar) {
            mo4099h().mo5545t(C1488o1.f4251l, yVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: H */
        public C1365b mo4856i(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4262h, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: I */
        public C1365b mo4857j(@C0359n0 SessionConfig sessionConfig) {
            mo4099h().mo5545t(C1488o1.f4250k, sessionConfig);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: J */
        public C1365b mo5040J(int i) {
            mo4099h().mo5545t(C1495p1.f4271y, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: K */
        public C1365b mo4858k(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4263i, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: L */
        public C1365b mo4863p(@C0359n0 SessionConfig.C1426d dVar) {
            mo4099h().mo5545t(C1488o1.f4252m, dVar);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: M */
        public C1365b mo4864q(@C0359n0 List<Pair<Integer, Size[]>> list) {
            mo4099h().mo5545t(C1491p0.f4264j, list);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: N */
        public C1365b mo4866s(int i) {
            mo4099h().mo5545t(C1488o1.f4254o, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: O */
        public C1365b mo4861n(int i) {
            mo4099h().mo5545t(C1491p0.f4259e, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: P */
        public C1365b mo4859l(@C0359n0 Class<C1363b4> cls) {
            mo4099h().mo5545t(C1611e.f4538s, cls);
            if (mo4099h().mo5131h(C1611e.f4537r, null) == null) {
                mo4855f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C1365b mo4855f(@C0359n0 String str) {
            mo4099h().mo5545t(C1611e.f4537r, str);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: R */
        public C1365b mo4860m(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4261g, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: S */
        public C1365b mo4853d(int i) {
            mo4099h().mo5545t(C1491p0.f4260f, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: T */
        public C1365b mo4851b(@C0359n0 UseCase.C1345b bVar) {
            mo4099h().mo5545t(C1615g.f4540u, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: U */
        public C1365b mo5051U(int i) {
            mo4099h().mo5545t(C1495p1.f4269w, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f3972a;
        }

        @C0359n0
        /* renamed from: t */
        public C1363b4 mo4098g() {
            if (mo4099h().mo5131h(C1491p0.f4259e, null) == null || mo4099h().mo5131h(C1491p0.f4261g, null) == null) {
                return new C1363b4(mo4862o());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public C1495p1 mo4862o() {
            return new C1495p1(C1441c1.m6059b0(this.f3972a));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: x */
        public C1365b mo5055x(int i) {
            mo4099h().mo5545t(C1495p1.f4272z, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: y */
        public C1365b mo5056y(int i) {
            mo4099h().mo5545t(C1495p1.f4266B, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: z */
        public C1365b mo5057z(int i) {
            mo4099h().mo5545t(C1495p1.f4268D, Integer.valueOf(i));
            return this;
        }

        public C1365b(@C0359n0 C1586y0 y0Var) {
            this.f3972a = y0Var;
            Class cls = (Class) y0Var.mo5131h(C1611e.f4538s, null);
            Class<C1363b4> cls2 = C1363b4.class;
            if (cls == null || cls.equals(cls2)) {
                mo4859l(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.b4$c */
    public static final class C1366c implements C1437b0<C1495p1> {

        /* renamed from: a */
        public static final int f3973a = 30;

        /* renamed from: b */
        public static final int f3974b = 8388608;

        /* renamed from: c */
        public static final int f3975c = 1;

        /* renamed from: d */
        public static final int f3976d = 64000;

        /* renamed from: e */
        public static final int f3977e = 8000;

        /* renamed from: f */
        public static final int f3978f = 1;

        /* renamed from: g */
        public static final int f3979g = 1;

        /* renamed from: h */
        public static final int f3980h = 1024;

        /* renamed from: i */
        public static final Size f3981i;

        /* renamed from: j */
        public static final int f3982j = 3;

        /* renamed from: k */
        public static final int f3983k = 1;

        /* renamed from: l */
        public static final C1495p1 f3984l;

        static {
            Size size = new Size(1920, 1080);
            f3981i = size;
            f3984l = new C1365b().mo5051U(30).mo5034D(8388608).mo5040J(1).mo5055x(f3976d).mo5032B(f3977e).mo5056y(1).mo5031A(1).mo5057z(1024).mo4858k(size).mo4866s(3).mo4861n(1).mo4862o();
        }

        @C0359n0
        /* renamed from: b */
        public C1495p1 mo4877a() {
            return f3984l;
        }
    }

    /* renamed from: androidx.camera.core.b4$d */
    public static final class C1367d {
        @C0363p0

        /* renamed from: a */
        public Location f3985a;
    }

    /* renamed from: androidx.camera.core.b4$e */
    public interface C1368e {
        /* renamed from: a */
        void mo5059a(int i, @C0359n0 String str, @C0363p0 Throwable th);

        /* renamed from: b */
        void mo5060b(@C0359n0 C1371g gVar);
    }

    /* renamed from: androidx.camera.core.b4$f */
    public static final class C1369f {

        /* renamed from: g */
        public static final C1367d f3986g = new C1367d();
        @C0363p0

        /* renamed from: a */
        public final File f3987a;
        @C0363p0

        /* renamed from: b */
        public final FileDescriptor f3988b;
        @C0363p0

        /* renamed from: c */
        public final ContentResolver f3989c;
        @C0363p0

        /* renamed from: d */
        public final Uri f3990d;
        @C0363p0

        /* renamed from: e */
        public final ContentValues f3991e;
        @C0363p0

        /* renamed from: f */
        public final C1367d f3992f;

        public C1369f(@C0363p0 File file, @C0363p0 FileDescriptor fileDescriptor, @C0363p0 ContentResolver contentResolver, @C0363p0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 C1367d dVar) {
            this.f3987a = file;
            this.f3988b = fileDescriptor;
            this.f3989c = contentResolver;
            this.f3990d = uri;
            this.f3991e = contentValues;
            this.f3992f = dVar == null ? f3986g : dVar;
        }

        @C0363p0
        /* renamed from: a */
        public ContentResolver mo5061a() {
            return this.f3989c;
        }

        @C0363p0
        /* renamed from: b */
        public ContentValues mo5062b() {
            return this.f3991e;
        }

        @C0363p0
        /* renamed from: c */
        public File mo5063c() {
            return this.f3987a;
        }

        @C0363p0
        /* renamed from: d */
        public FileDescriptor mo5064d() {
            return this.f3988b;
        }

        @C0363p0
        /* renamed from: e */
        public C1367d mo5065e() {
            return this.f3992f;
        }

        @C0363p0
        /* renamed from: f */
        public Uri mo5066f() {
            return this.f3990d;
        }

        /* renamed from: g */
        public boolean mo5067g() {
            return mo5063c() != null;
        }

        /* renamed from: h */
        public boolean mo5068h() {
            return mo5064d() != null;
        }

        /* renamed from: i */
        public boolean mo5069i() {
            if (mo5066f() == null || mo5061a() == null || mo5062b() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: androidx.camera.core.b4$f$a */
        public static final class C1370a {
            @C0363p0

            /* renamed from: a */
            public File f3993a;
            @C0363p0

            /* renamed from: b */
            public FileDescriptor f3994b;
            @C0363p0

            /* renamed from: c */
            public ContentResolver f3995c;
            @C0363p0

            /* renamed from: d */
            public Uri f3996d;
            @C0363p0

            /* renamed from: e */
            public ContentValues f3997e;
            @C0363p0

            /* renamed from: f */
            public C1367d f3998f;

            public C1370a(@C0359n0 File file) {
                this.f3993a = file;
            }

            @C0359n0
            /* renamed from: a */
            public C1369f mo5070a() {
                return new C1369f(this.f3993a, this.f3994b, this.f3995c, this.f3996d, this.f3997e, this.f3998f);
            }

            @C0359n0
            /* renamed from: b */
            public C1370a mo5071b(@C0359n0 C1367d dVar) {
                this.f3998f = dVar;
                return this;
            }

            public C1370a(@C0359n0 FileDescriptor fileDescriptor) {
                C18001r.m81765b(Build.VERSION.SDK_INT >= 26, "Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
                this.f3994b = fileDescriptor;
            }

            public C1370a(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 ContentValues contentValues) {
                this.f3995c = contentResolver;
                this.f3996d = uri;
                this.f3997e = contentValues;
            }
        }
    }

    /* renamed from: androidx.camera.core.b4$g */
    public static class C1371g {
        @C0363p0

        /* renamed from: a */
        public Uri f3999a;

        public C1371g(@C0363p0 Uri uri) {
            this.f3999a = uri;
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo5072a() {
            return this.f3999a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.b4$h */
    public @interface C1372h {
    }

    /* renamed from: androidx.camera.core.b4$i */
    public static final class C1373i implements C1368e {
        @C0359n0

        /* renamed from: a */
        public Executor f4000a;
        @C0359n0

        /* renamed from: b */
        public C1368e f4001b;

        public C1373i(@C0359n0 Executor executor, @C0359n0 C1368e eVar) {
            this.f4000a = executor;
            this.f4001b = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m5849e(int i, String str, Throwable th) {
            this.f4001b.mo5059a(i, str, th);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m5850f(C1371g gVar) {
            this.f4001b.mo5060b(gVar);
        }

        /* renamed from: a */
        public void mo5059a(int i, @C0359n0 String str, @C0363p0 Throwable th) {
            try {
                this.f4000a.execute(new C1387d4(this, i, str, th));
            } catch (RejectedExecutionException unused) {
                C1417i2.m5913c(C1363b4.f3934V, "Unable to post to the supplied executor.");
            }
        }

        /* renamed from: b */
        public void mo5060b(@C0359n0 C1371g gVar) {
            try {
                this.f4000a.execute(new C1380c4(this, gVar));
            } catch (RejectedExecutionException unused) {
                C1417i2.m5913c(C1363b4.f3934V, "Unable to post to the supplied executor.");
            }
        }
    }

    public C1363b4(@C0359n0 C1495p1 p1Var) {
        super(p1Var);
    }

    /* renamed from: U */
    public static MediaFormat m5752U(C1495p1 p1Var, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(f3936X, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", p1Var.mo5312j0());
        createVideoFormat.setInteger("frame-rate", p1Var.mo5316n0());
        createVideoFormat.setInteger("i-frame-interval", p1Var.mo5314l0());
        return createVideoFormat;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m5754Z(boolean z, MediaCodec mediaCodec) {
        if (z && mediaCodec != null) {
            mediaCodec.release();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m5757c0() {
        this.f3968z = null;
        if (mo4952c() != null) {
            mo5024k0(mo4954e(), mo4951b());
            mo4966s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m5759e0(C1368e eVar, String str, Size size, CallbackToFutureAdapter.C16559a aVar) {
        if (!mo5027n0(eVar, str, size)) {
            eVar.mo5060b(new C1371g(this.f3952M));
            this.f3952M = null;
        }
        aVar.mo48125c(null);
    }

    @C0341g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public void mo4781C() {
        m5760f0();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public Size mo4782D(@C0359n0 Size size) {
        if (this.f3944E != null) {
            this.f3966x.stop();
            this.f3966x.release();
            this.f3967y.stop();
            this.f3967y.release();
            mo5020g0(false);
        }
        try {
            this.f3966x = MediaCodec.createEncoderByType(f3936X);
            this.f3967y = MediaCodec.createEncoderByType(f3937Y);
            mo5024k0(mo4954e(), size);
            return size;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e.getCause());
        }
    }

    /* renamed from: R */
    public boolean m5758d0(C1368e eVar) {
        int i;
        boolean z = false;
        while (!z && this.f3947H) {
            if (this.f3957o.get()) {
                this.f3957o.set(false);
                this.f3947H = false;
            }
            MediaCodec mediaCodec = this.f3967y;
            if (mediaCodec != null && this.f3945F != null) {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer V = mo5017V(this.f3967y, dequeueInputBuffer);
                    V.clear();
                    int read = this.f3945F.read(V, this.f3946G);
                    if (read > 0) {
                        MediaCodec mediaCodec2 = this.f3967y;
                        long nanoTime = System.nanoTime() / 1000;
                        if (this.f3947H) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                        mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, read, nanoTime, i);
                    }
                }
                while (true) {
                    int dequeueOutputBuffer = this.f3967y.dequeueOutputBuffer(this.f3959q, 0);
                    if (dequeueOutputBuffer == -2) {
                        synchronized (this.f3955m) {
                            int addTrack = this.f3940A.addTrack(this.f3967y.getOutputFormat());
                            this.f3943D = addTrack;
                            if (addTrack >= 0 && this.f3942C >= 0) {
                                this.f3941B = true;
                                this.f3940A.start();
                            }
                        }
                    } else if (dequeueOutputBuffer != -1) {
                        z = mo5028o0(dequeueOutputBuffer);
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (z) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        try {
            C1417i2.m5915e(f3934V, "audioRecorder stop");
            this.f3945F.stop();
        } catch (IllegalStateException e) {
            eVar.mo5059a(1, "Audio recorder stop failed!", e);
        }
        try {
            this.f3967y.stop();
        } catch (IllegalStateException e2) {
            eVar.mo5059a(1, "Audio encoder stop failed!", e2);
        }
        C1417i2.m5915e(f3934V, "Audio encode thread end");
        this.f3956n.set(true);
        return false;
    }

    /* renamed from: S */
    public final AudioRecord mo5015S(C1495p1 p1Var) {
        int i;
        short[] sArr = f3939a0;
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            if (this.f3948I == 1) {
                i = 16;
            } else {
                i = 12;
            }
            int i3 = i;
            int f0 = p1Var.mo5308f0();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(this.f3949J, i3, s);
                if (minBufferSize <= 0) {
                    minBufferSize = p1Var.mo5306d0();
                }
                int i4 = minBufferSize;
                AudioRecord audioRecord = new AudioRecord(f0, this.f3949J, i3, s, i4 * 2);
                if (audioRecord.getState() == 1) {
                    this.f3946G = i4;
                    C1417i2.m5915e(f3934V, "source: " + f0 + " audioSampleRate: " + this.f3949J + " channelConfig: " + i3 + " audioFormat: " + s + " bufferSize: " + i4);
                    return audioRecord;
                }
                i2++;
            } catch (Exception e) {
                C1417i2.m5914d(f3934V, "Exception, keep trying.", e);
            }
        }
        return null;
    }

    /* renamed from: T */
    public final MediaFormat mo5016T() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(f3937Y, this.f3949J, this.f3948I);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", this.f3950K);
        return createAudioFormat;
    }

    /* renamed from: V */
    public final ByteBuffer mo5017V(MediaCodec mediaCodec, int i) {
        return mediaCodec.getInputBuffer(i);
    }

    /* renamed from: W */
    public final ByteBuffer mo5018W(MediaCodec mediaCodec, int i) {
        return mediaCodec.getOutputBuffer(i);
    }

    @SuppressLint({"UnsafeNewApiCall"})
    @C0359n0
    /* renamed from: X */
    public final MediaMuxer mo5019X(@C0359n0 C1369f fVar) throws IOException {
        ContentValues contentValues;
        if (fVar.mo5067g()) {
            File c = fVar.mo5063c();
            this.f3952M = Uri.fromFile(fVar.mo5063c());
            return new MediaMuxer(c.getAbsolutePath(), 0);
        } else if (fVar.mo5068h()) {
            if (Build.VERSION.SDK_INT >= 26) {
                C1682r3.m6836a();
                return C1673q3.m6770a(fVar.mo5064d(), 0);
            }
            throw new IllegalArgumentException("Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
        } else if (fVar.mo5069i()) {
            if (fVar.mo5062b() != null) {
                contentValues = new ContentValues(fVar.mo5062b());
            } else {
                contentValues = new ContentValues();
            }
            Uri insert = fVar.mo5061a().insert(fVar.mo5066f(), contentValues);
            this.f3952M = insert;
            if (insert != null) {
                try {
                    if (Build.VERSION.SDK_INT < 26) {
                        String a = C1622b.m6678a(fVar.mo5061a(), this.f3952M);
                        C1417i2.m5915e(f3934V, "Saved Location Path: " + a);
                        return new MediaMuxer(a, 0);
                    }
                    this.f3953N = fVar.mo5061a().openFileDescriptor(this.f3952M, "rw");
                    C1682r3.m6836a();
                    return C1673q3.m6770a(this.f3953N.getFileDescriptor(), 0);
                } catch (IOException e) {
                    this.f3952M = null;
                    throw e;
                }
            } else {
                throw new IOException("Invalid Uri!");
            }
        } else {
            throw new IllegalArgumentException("The OutputFileOptions should assign before recording");
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C1488o1<?> mo4801g(boolean z, @C0359n0 UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo4721a(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
        if (z) {
            a = Config.m5971R(a, f3933U.mo4877a());
        }
        if (a == null) {
            return null;
        }
        return mo4807m(a).mo4862o();
    }

    @C0341g1
    /* renamed from: g0 */
    public final void mo5020g0(boolean z) {
        DeferrableSurface deferrableSurface = this.f3951L;
        if (deferrableSurface != null) {
            MediaCodec mediaCodec = this.f3966x;
            deferrableSurface.mo5136c();
            this.f3951L.mo5139f().mo5489q(new C1743z3(z, mediaCodec), C1525a.m6441e());
            if (z) {
                this.f3966x = null;
            }
            this.f3944E = null;
            this.f3951L = null;
        }
    }

    /* renamed from: h0 */
    public final void m5753Y() {
        this.f3962t.quitSafely();
        this.f3964v.quitSafely();
        MediaCodec mediaCodec = this.f3967y;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f3967y = null;
        }
        AudioRecord audioRecord = this.f3945F;
        if (audioRecord != null) {
            audioRecord.release();
            this.f3945F = null;
        }
        if (this.f3944E != null) {
            mo5020g0(true);
        }
    }

    /* renamed from: i0 */
    public final void mo5022i0(Size size, String str) {
        boolean z = false;
        try {
            int[] iArr = f3938Z;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int i2 = iArr[i];
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i2)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i2);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.f3948I = camcorderProfile.audioChannels;
                        this.f3949J = camcorderProfile.audioSampleRate;
                        this.f3950K = camcorderProfile.audioBitRate;
                        z = true;
                        break;
                    }
                }
                i++;
            }
        } catch (NumberFormatException unused) {
            C1417i2.m5915e(f3934V, "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        if (!z) {
            C1495p1 p1Var = (C1495p1) mo4955f();
            this.f3948I = p1Var.mo5304b0();
            this.f3949J = p1Var.mo5310h0();
            this.f3950K = p1Var.mo5302Z();
        }
    }

    /* renamed from: j0 */
    public void mo5023j0(int i) {
        mo4946F(i);
    }

    @C0341g1
    /* renamed from: k0 */
    public void mo5024k0(@C0359n0 String str, @C0359n0 Size size) {
        C1495p1 p1Var = (C1495p1) mo4955f();
        this.f3966x.reset();
        this.f3966x.configure(m5752U(p1Var, size), (Surface) null, (MediaCrypto) null, 1);
        if (this.f3944E != null) {
            mo5020g0(false);
        }
        Surface createInputSurface = this.f3966x.createInputSurface();
        this.f3944E = createInputSurface;
        SessionConfig.C1424b p = SessionConfig.C1424b.m6009p(p1Var);
        DeferrableSurface deferrableSurface = this.f3951L;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        C1503s0 s0Var = new C1503s0(this.f3944E);
        this.f3951L = s0Var;
        C32487a<Void> f = s0Var.mo5139f();
        Objects.requireNonNull(createInputSurface);
        f.mo5489q(new C1687s3(createInputSurface), C1525a.m6441e());
        p.mo5164l(this.f3951L);
        p.mo5159g(new C1364a(str, size));
        mo4948H(p.mo5166n());
        mo5022i0(size, str);
        this.f3967y.reset();
        this.f3967y.configure(mo5016T(), (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = this.f3945F;
        if (audioRecord != null) {
            audioRecord.release();
        }
        AudioRecord S = mo5015S(p1Var);
        this.f3945F = S;
        if (S == null) {
            C1417i2.m5913c(f3934V, "AudioRecord object cannot initialized correctly!");
        }
        this.f3942C = -1;
        this.f3943D = -1;
        this.f3947H = false;
    }

    /* renamed from: l0 */
    public void m5755a0(@C0359n0 C1369f fVar, @C0359n0 Executor executor, @C0359n0 C1368e eVar) {
        Location location;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C1525a.m6441e().execute(new C1699t3(this, fVar, executor, eVar));
            return;
        }
        C1417i2.m5915e(f3934V, "startRecording");
        this.f3960r.set(false);
        this.f3961s.set(false);
        C1373i iVar = new C1373i(executor, eVar);
        CameraInternal c = mo4952c();
        if (c == null) {
            iVar.mo5059a(5, "Not bound to a Camera [" + this + "]", (Throwable) null);
        } else if (!this.f3958p.get()) {
            iVar.mo5059a(3, "It is still in video recording!", (Throwable) null);
        } else {
            try {
                this.f3945F.startRecording();
                AtomicReference atomicReference = new AtomicReference();
                this.f3968z = CallbackToFutureAdapter.m74987a(new C1704u3(atomicReference));
                CallbackToFutureAdapter.C16559a aVar = (CallbackToFutureAdapter.C16559a) C18001r.m81775l((CallbackToFutureAdapter.C16559a) atomicReference.get());
                this.f3968z.mo5489q(new C1709v3(this), C1525a.m6441e());
                try {
                    C1417i2.m5915e(f3934V, "videoEncoder start");
                    this.f3966x.start();
                    C1417i2.m5915e(f3934V, "audioEncoder start");
                    this.f3967y.start();
                    try {
                        synchronized (this.f3955m) {
                            MediaMuxer X = mo5019X(fVar);
                            this.f3940A = X;
                            C18001r.m81775l(X);
                            this.f3940A.setOrientationHint(mo4958j(c));
                            C1367d e = fVar.mo5065e();
                            if (!(e == null || (location = e.f3985a) == null)) {
                                this.f3940A.setLocation((float) location.getLatitude(), (float) e.f3985a.getLongitude());
                            }
                        }
                        this.f3956n.set(false);
                        this.f3957o.set(false);
                        this.f3958p.set(false);
                        this.f3947H = true;
                        mo4964q();
                        this.f3965w.post(new C1714w3(this, iVar));
                        this.f3963u.post(new C1721x3(this, iVar, mo4954e(), mo4951b(), aVar));
                    } catch (IOException e2) {
                        aVar.mo48125c(null);
                        iVar.mo5059a(2, "MediaMuxer creation failed!", e2);
                    }
                } catch (IllegalStateException e3) {
                    aVar.mo48125c(null);
                    iVar.mo5059a(1, "Audio/Video encoder start fail", e3);
                }
            } catch (IllegalStateException e4) {
                iVar.mo5059a(1, "AudioRecorder start fail", e4);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: m */
    public C1488o1.C1489a<?, ?, ?> mo4807m(@C0359n0 Config config) {
        return C1365b.m5784u(config);
    }

    /* renamed from: m0 */
    public void m5760f0() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C1525a.m6441e().execute(new C1738y3(this));
            return;
        }
        C1417i2.m5915e(f3934V, "stopRecording");
        mo4965r();
        if (!this.f3958p.get() && this.f3947H) {
            this.f3957o.set(true);
        }
    }

    /* renamed from: n0 */
    public boolean mo5027n0(@C0359n0 C1368e eVar, @C0359n0 String str, @C0359n0 Size size) {
        boolean z = false;
        boolean z2 = false;
        while (!z && !z2) {
            if (this.f3956n.get()) {
                this.f3966x.signalEndOfInputStream();
                this.f3956n.set(false);
            }
            int dequeueOutputBuffer = this.f3966x.dequeueOutputBuffer(this.f3954l, 10000);
            if (dequeueOutputBuffer == -2) {
                if (this.f3941B) {
                    eVar.mo5059a(1, "Unexpected change in video encoding format.", (Throwable) null);
                    z2 = true;
                }
                synchronized (this.f3955m) {
                    int addTrack = this.f3940A.addTrack(this.f3966x.getOutputFormat());
                    this.f3942C = addTrack;
                    if (this.f3943D >= 0 && addTrack >= 0) {
                        this.f3941B = true;
                        C1417i2.m5915e(f3934V, "media mMuxer start");
                        this.f3940A.start();
                    }
                }
            } else if (dequeueOutputBuffer != -1) {
                z = mo5029p0(dequeueOutputBuffer);
            }
        }
        try {
            C1417i2.m5915e(f3934V, "videoEncoder stop");
            this.f3966x.stop();
        } catch (IllegalStateException e) {
            eVar.mo5059a(1, "Video encoder stop failed!", e);
            z2 = true;
        }
        try {
            synchronized (this.f3955m) {
                MediaMuxer mediaMuxer = this.f3940A;
                if (mediaMuxer != null) {
                    if (this.f3941B) {
                        mediaMuxer.stop();
                    }
                    this.f3940A.release();
                    this.f3940A = null;
                }
            }
        } catch (IllegalStateException e2) {
            eVar.mo5059a(2, "Muxer stop failed!", e2);
            z2 = true;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f3953N;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.f3953N = null;
            } catch (IOException e3) {
                eVar.mo5059a(2, "File descriptor close failed!", e3);
                z2 = true;
            }
        }
        this.f3941B = false;
        this.f3958p.set(true);
        C1417i2.m5915e(f3934V, "Video encode thread end.");
        return z2;
    }

    /* renamed from: o0 */
    public final boolean mo5028o0(int i) {
        ByteBuffer W = mo5018W(this.f3967y, i);
        W.position(this.f3959q.offset);
        if (this.f3943D >= 0 && this.f3942C >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.f3959q;
            if (bufferInfo.size > 0 && bufferInfo.presentationTimeUs > 0) {
                try {
                    synchronized (this.f3955m) {
                        if (!this.f3961s.get()) {
                            C1417i2.m5915e(f3934V, "First audio sample written.");
                            this.f3961s.set(true);
                        }
                        this.f3940A.writeSampleData(this.f3943D, W, this.f3959q);
                    }
                } catch (Exception e) {
                    C1417i2.m5913c(f3934V, "audio error:size=" + this.f3959q.size + "/offset=" + this.f3959q.offset + "/timeUs=" + this.f3959q.presentationTimeUs);
                    e.printStackTrace();
                }
            }
        }
        this.f3967y.releaseOutputBuffer(i, false);
        if ((this.f3959q.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    public final boolean mo5029p0(int i) {
        if (i < 0) {
            C1417i2.m5913c(f3934V, "Output buffer should not have negative index: " + i);
            return false;
        }
        ByteBuffer outputBuffer = this.f3966x.getOutputBuffer(i);
        if (outputBuffer == null) {
            C1417i2.m5911a(f3934V, "OutputBuffer was null.");
            return false;
        }
        if (this.f3943D >= 0 && this.f3942C >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.f3954l;
            if (bufferInfo.size > 0) {
                outputBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.f3954l;
                outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                this.f3954l.presentationTimeUs = System.nanoTime() / 1000;
                synchronized (this.f3955m) {
                    if (!this.f3960r.get()) {
                        C1417i2.m5915e(f3934V, "First video sample written.");
                        this.f3960r.set(true);
                    }
                    this.f3940A.writeSampleData(this.f3942C, outputBuffer, this.f3954l);
                }
            }
        }
        this.f3966x.releaseOutputBuffer(i, false);
        if ((this.f3954l.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public void mo4817w() {
        this.f3962t = new HandlerThread("CameraX-video encoding thread");
        this.f3964v = new HandlerThread("CameraX-audio encoding thread");
        this.f3962t.start();
        this.f3963u = new Handler(this.f3962t.getLooper());
        this.f3964v.start();
        this.f3965w = new Handler(this.f3964v.getLooper());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo4819z() {
        m5760f0();
        C32487a<Void> aVar = this.f3968z;
        if (aVar != null) {
            aVar.mo5489q(new C1356a4(this), C1525a.m6441e());
        } else {
            m5753Y();
        }
    }
}
