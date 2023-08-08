package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.C0323b0;
import androidx.annotation.C0337f0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1663p0;
import androidx.camera.core.ImageSaver;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1437b0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1475l0;
import androidx.camera.core.impl.C1487o0;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.C1500r0;
import androidx.camera.core.impl.C1503s0;
import androidx.camera.core.impl.C1581x;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.C1587z;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.C1515c;
import androidx.camera.core.impl.utils.C1516d;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.camera.core.internal.C1609d;
import androidx.camera.core.internal.C1611e;
import androidx.camera.core.internal.C1615g;
import androidx.camera.core.internal.C1618i;
import androidx.camera.core.internal.compat.quirk.C1605g;
import androidx.camera.core.internal.compat.workaround.C1607a;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ImageCapture extends UseCase {

    /* renamed from: H */
    public static final int f3721H = 0;

    /* renamed from: I */
    public static final int f3722I = 1;

    /* renamed from: J */
    public static final int f3723J = 2;

    /* renamed from: K */
    public static final int f3724K = 3;

    /* renamed from: L */
    public static final int f3725L = 4;

    /* renamed from: M */
    public static final int f3726M = 0;

    /* renamed from: N */
    public static final int f3727N = 1;

    /* renamed from: O */
    public static final int f3728O = -1;

    /* renamed from: P */
    public static final int f3729P = 0;

    /* renamed from: Q */
    public static final int f3730Q = 1;

    /* renamed from: R */
    public static final int f3731R = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: S */
    public static final C1317m f3732S = new C1317m();

    /* renamed from: T */
    public static final String f3733T = "ImageCapture";

    /* renamed from: U */
    public static final long f3734U = 1000;

    /* renamed from: V */
    public static final long f3735V = 5000;

    /* renamed from: W */
    public static final int f3736W = 2;

    /* renamed from: X */
    public static final byte f3737X = 100;

    /* renamed from: Y */
    public static final byte f3738Y = 95;

    /* renamed from: Z */
    public static final int f3739Z = 1;

    /* renamed from: a0 */
    public static final int f3740a0 = 2;

    /* renamed from: A */
    public SessionConfig.C1424b f3741A;

    /* renamed from: B */
    public C1362b3 f3742B;

    /* renamed from: C */
    public C1695t2 f3743C;

    /* renamed from: D */
    public C1448f f3744D;

    /* renamed from: E */
    public DeferrableSurface f3745E;

    /* renamed from: F */
    public C1321q f3746F;

    /* renamed from: G */
    public final Executor f3747G;

    /* renamed from: l */
    public final C1312k f3748l = new C1312k();

    /* renamed from: m */
    public final C1500r0.C1501a f3749m = new C1359b1();
    @C0359n0

    /* renamed from: n */
    public final Executor f3750n;

    /* renamed from: o */
    public final int f3751o;

    /* renamed from: p */
    public final boolean f3752p;
    @C0323b0("mLockedFlashMode")

    /* renamed from: q */
    public final AtomicReference<Integer> f3753q = new AtomicReference<>((Object) null);
    @C0323b0("mLockedFlashMode")

    /* renamed from: r */
    public int f3754r = -1;

    /* renamed from: s */
    public Rational f3755s = null;

    /* renamed from: t */
    public ExecutorService f3756t;

    /* renamed from: u */
    public C1583y f3757u;

    /* renamed from: v */
    public C1581x f3758v;

    /* renamed from: w */
    public int f3759w;

    /* renamed from: x */
    public C1587z f3760x;

    /* renamed from: y */
    public boolean f3761y = false;

    /* renamed from: z */
    public boolean f3762z = false;

    public static final class CaptureFailedException extends RuntimeException {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public CaptureFailedException(String str, Throwable th) {
            super(str, th);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public CaptureFailedException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$a */
    public class C1302a extends C1448f {
        public C1302a() {
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$b */
    public class C1303b implements ImageSaver.C1335b {

        /* renamed from: a */
        public final /* synthetic */ C1326t f3764a;

        public C1303b(C1326t tVar) {
            this.f3764a = tVar;
        }

        /* renamed from: a */
        public void mo4820a(@C0359n0 C1329v vVar) {
            this.f3764a.mo4894a(vVar);
        }

        /* renamed from: b */
        public void mo4821b(@C0359n0 ImageSaver.SaveError saveError, @C0359n0 String str, @C0363p0 Throwable th) {
            int i = 1;
            if (C1310i.f3780a[saveError.ordinal()] != 1) {
                i = 0;
            }
            this.f3764a.mo4895b(new ImageCaptureException(i, str, th));
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$c */
    public class C1304c extends C1325s {

        /* renamed from: a */
        public final /* synthetic */ C1327u f3766a;

        /* renamed from: b */
        public final /* synthetic */ Executor f3767b;

        /* renamed from: c */
        public final /* synthetic */ ImageSaver.C1335b f3768c;

        /* renamed from: d */
        public final /* synthetic */ C1326t f3769d;

        public C1304c(C1327u uVar, Executor executor, ImageSaver.C1335b bVar, C1326t tVar) {
            this.f3766a = uVar;
            this.f3767b = executor;
            this.f3768c = bVar;
            this.f3769d = tVar;
        }

        /* renamed from: a */
        public void mo4822a(@C0359n0 C1353a2 a2Var) {
            ImageCapture.this.f3750n.execute(new ImageSaver(a2Var, this.f3766a, a2Var.mo4977q3().mo5102c(), this.f3767b, ImageCapture.this.f3747G, this.f3768c));
        }

        /* renamed from: b */
        public void mo4823b(@C0359n0 ImageCaptureException imageCaptureException) {
            this.f3769d.mo4895b(imageCaptureException);
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$d */
    public class C1305d implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C1330w f3771a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3772b;

        public C1305d(C1330w wVar, CallbackToFutureAdapter.C16559a aVar) {
            this.f3771a = wVar;
            this.f3772b = aVar;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            ImageCapture.this.mo4785S0(this.f3771a);
            this.f3772b.mo48128f(th);
        }

        /* renamed from: c */
        public void mo4160a(Void voidR) {
            ImageCapture.this.mo4785S0(this.f3771a);
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$e */
    public class C1306e implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f3774a = new AtomicInteger(0);

        public C1306e() {
        }

        public Thread newThread(@C0359n0 Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f3774a.getAndIncrement());
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$f */
    public class C1307f implements C1312k.C1314b<C1456h> {
        public C1307f() {
        }

        /* renamed from: b */
        public C1456h mo4826a(@C0359n0 C1456h hVar) {
            if (C1417i2.m5917g(ImageCapture.f3733T)) {
                C1417i2.m5911a(ImageCapture.f3733T, "preCaptureState, AE=" + hVar.mo4465g() + " AF =" + hVar.mo4462d() + " AWB=" + hVar.mo4463e());
            }
            return hVar;
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$g */
    public class C1308g implements C1312k.C1314b<Boolean> {
        public C1308g() {
        }

        /* renamed from: b */
        public Boolean mo4826a(@C0359n0 C1456h hVar) {
            if (C1417i2.m5917g(ImageCapture.f3733T)) {
                C1417i2.m5911a(ImageCapture.f3733T, "checkCaptureResult, AE=" + hVar.mo4465g() + " AF =" + hVar.mo4462d() + " AWB=" + hVar.mo4463e());
            }
            if (ImageCapture.this.mo4813s0(hVar)) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$h */
    public class C1309h extends C1448f {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3778a;

        public C1309h(CallbackToFutureAdapter.C16559a aVar) {
            this.f3778a = aVar;
        }

        /* renamed from: a */
        public void mo4262a() {
            this.f3778a.mo48128f(new CameraClosedException("Capture request is cancelled because camera is closed"));
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            this.f3778a.mo48125c(null);
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            this.f3778a.mo48128f(new CaptureFailedException("Capture request failed with reason " + cameraCaptureFailure.mo5117a()));
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$i */
    public static /* synthetic */ class C1310i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3780a;

        static {
            int[] iArr = new int[ImageSaver.SaveError.values().length];
            f3780a = iArr;
            try {
                iArr[ImageSaver.SaveError.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$j */
    public static final class C1311j implements C1488o1.C1489a<ImageCapture, C1475l0, C1311j>, C1491p0.C1492a<C1311j>, C1609d.C1610a<C1311j> {

        /* renamed from: a */
        public final C1586y0 f3781a;

        public C1311j() {
            this(C1586y0.m6573d0());
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: u */
        public static C1311j m5482u(@C0359n0 Config config) {
            return new C1311j(C1586y0.m6574e0(config));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: v */
        public static C1311j m5483v(@C0359n0 C1475l0 l0Var) {
            return new C1311j(C1586y0.m6574e0(l0Var));
        }

        @C0359n0
        /* renamed from: A */
        public C1311j mo4829A(int i) {
            mo4099h().mo5545t(C1475l0.f4236w, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: B */
        public C1311j mo4852c(@C0359n0 C1583y.C1585b bVar) {
            mo4099h().mo5545t(C1488o1.f4253n, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: C */
        public C1311j mo4831C(@C0359n0 C1587z zVar) {
            mo4099h().mo5545t(C1475l0.f4239z, zVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: D */
        public C1311j mo4865r(@C0359n0 C1583y yVar) {
            mo4099h().mo5545t(C1488o1.f4251l, yVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: E */
        public C1311j mo4856i(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4262h, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: F */
        public C1311j mo4857j(@C0359n0 SessionConfig sessionConfig) {
            mo4099h().mo5545t(C1488o1.f4250k, sessionConfig);
            return this;
        }

        @C0359n0
        /* renamed from: G */
        public C1311j mo4835G(int i) {
            mo4099h().mo5545t(C1475l0.f4237x, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: H */
        public C1311j mo4836H(@C0359n0 C1378c2 c2Var) {
            mo4099h().mo5545t(C1475l0.f4234C, c2Var);
            return this;
        }

        @C0359n0
        /* renamed from: I */
        public C1311j mo4854e(@C0359n0 Executor executor) {
            mo4099h().mo5545t(C1609d.f4536q, executor);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: J */
        public C1311j mo4838J(int i) {
            mo4099h().mo5545t(C1475l0.f4233B, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: K */
        public C1311j mo4858k(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4263i, size);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: L */
        public C1311j mo4863p(@C0359n0 SessionConfig.C1426d dVar) {
            mo4099h().mo5545t(C1488o1.f4252m, dVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: M */
        public C1311j mo4841M(boolean z) {
            mo4099h().mo5545t(C1475l0.f4235D, Boolean.valueOf(z));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: N */
        public C1311j mo4864q(@C0359n0 List<Pair<Integer, Size[]>> list) {
            mo4099h().mo5545t(C1491p0.f4264j, list);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: O */
        public C1311j mo4866s(int i) {
            mo4099h().mo5545t(C1488o1.f4254o, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        /* renamed from: P */
        public C1311j mo4861n(int i) {
            mo4099h().mo5545t(C1491p0.f4259e, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: Q */
        public C1311j mo4859l(@C0359n0 Class<ImageCapture> cls) {
            mo4099h().mo5545t(C1611e.f4538s, cls);
            if (mo4099h().mo5131h(C1611e.f4537r, null) == null) {
                mo4855f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @C0359n0
        /* renamed from: R */
        public C1311j mo4855f(@C0359n0 String str) {
            mo4099h().mo5545t(C1611e.f4537r, str);
            return this;
        }

        @C0359n0
        /* renamed from: S */
        public C1311j mo4860m(@C0359n0 Size size) {
            mo4099h().mo5545t(C1491p0.f4261g, size);
            return this;
        }

        @C0359n0
        /* renamed from: T */
        public C1311j mo4853d(int i) {
            mo4099h().mo5545t(C1491p0.f4260f, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: U */
        public C1311j mo4851b(@C0359n0 UseCase.C1345b bVar) {
            mo4099h().mo5545t(C1615g.f4540u, bVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f3781a;
        }

        @C0359n0
        /* renamed from: t */
        public ImageCapture mo4098g() {
            int intValue;
            boolean z;
            if (mo4099h().mo5131h(C1491p0.f4259e, null) == null || mo4099h().mo5131h(C1491p0.f4261g, null) == null) {
                Integer num = (Integer) mo4099h().mo5131h(C1475l0.f4232A, null);
                boolean z2 = false;
                if (num != null) {
                    if (mo4099h().mo5131h(C1475l0.f4239z, null) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18001r.m81765b(z, "Cannot set buffer format with CaptureProcessor defined.");
                    mo4099h().mo5545t(C1487o0.f4249c, num);
                } else if (mo4099h().mo5131h(C1475l0.f4239z, null) != null) {
                    mo4099h().mo5545t(C1487o0.f4249c, 35);
                } else {
                    mo4099h().mo5545t(C1487o0.f4249c, 256);
                }
                ImageCapture imageCapture = new ImageCapture(mo4862o());
                Size size = (Size) mo4099h().mo5131h(C1491p0.f4261g, null);
                if (size != null) {
                    imageCapture.mo4788V0(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) mo4099h().mo5131h(C1475l0.f4233B, 2)).intValue() >= 1) {
                    z2 = true;
                }
                C18001r.m81765b(z2, "Maximum outstanding image count must be at least 1");
                C18001r.m81776m((Executor) mo4099h().mo5131h(C1609d.f4536q, C1525a.m6439c()), "The IO executor can't be null");
                C1582x0 h = mo4099h();
                Config.C1421a<Integer> aVar = C1475l0.f4237x;
                if (!h.mo5126c(aVar) || (intValue = ((Integer) mo4099h().mo5125b(aVar)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return imageCapture;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public C1475l0 mo4862o() {
            return new C1475l0(C1441c1.m6059b0(this.f3781a));
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: x */
        public C1311j mo4869x(int i) {
            mo4099h().mo5545t(C1475l0.f4232A, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: y */
        public C1311j mo4850a(@C0359n0 C1647n nVar) {
            mo4099h().mo5545t(C1488o1.f4255p, nVar);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: z */
        public C1311j mo4871z(@C0359n0 C1581x xVar) {
            mo4099h().mo5545t(C1475l0.f4238y, xVar);
            return this;
        }

        public C1311j(C1586y0 y0Var) {
            this.f3781a = y0Var;
            Class cls = (Class) y0Var.mo5131h(C1611e.f4538s, null);
            Class<ImageCapture> cls2 = ImageCapture.class;
            if (cls == null || cls.equals(cls2)) {
                mo4859l(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$k */
    public static final class C1312k extends C1448f {

        /* renamed from: b */
        public static final long f3782b = 0;

        /* renamed from: a */
        public final Set<C1315c> f3783a = new HashSet();

        /* renamed from: androidx.camera.core.ImageCapture$k$a */
        public class C1313a implements C1315c {

            /* renamed from: a */
            public final /* synthetic */ C1314b f3784a;

            /* renamed from: b */
            public final /* synthetic */ CallbackToFutureAdapter.C16559a f3785b;

            /* renamed from: c */
            public final /* synthetic */ long f3786c;

            /* renamed from: d */
            public final /* synthetic */ long f3787d;

            /* renamed from: e */
            public final /* synthetic */ Object f3788e;

            public C1313a(C1314b bVar, CallbackToFutureAdapter.C16559a aVar, long j, long j2, Object obj) {
                this.f3784a = bVar;
                this.f3785b = aVar;
                this.f3786c = j;
                this.f3787d = j2;
                this.f3788e = obj;
            }

            /* renamed from: a */
            public boolean mo4876a(@C0359n0 C1456h hVar) {
                Object a = this.f3784a.mo4826a(hVar);
                if (a != null) {
                    this.f3785b.mo48125c(a);
                    return true;
                } else if (this.f3786c <= 0 || SystemClock.elapsedRealtime() - this.f3786c <= this.f3787d) {
                    return false;
                } else {
                    this.f3785b.mo48125c(this.f3788e);
                    return true;
                }
            }
        }

        /* renamed from: androidx.camera.core.ImageCapture$k$b */
        public interface C1314b<T> {
            @C0363p0
            /* renamed from: a */
            T mo4826a(@C0359n0 C1456h hVar);
        }

        /* renamed from: androidx.camera.core.ImageCapture$k$c */
        public interface C1315c {
            /* renamed from: a */
            boolean mo4876a(@C0359n0 C1456h hVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ Object m5530i(C1314b bVar, long j, long j2, Object obj, CallbackToFutureAdapter.C16559a aVar) throws Exception {
            mo4872e(new C1313a(bVar, aVar, j, j2, obj));
            return "checkCaptureResult";
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            mo4875h(hVar);
        }

        /* renamed from: e */
        public void mo4872e(C1315c cVar) {
            synchronized (this.f3783a) {
                this.f3783a.add(cVar);
            }
        }

        /* renamed from: f */
        public <T> C32487a<T> mo4873f(C1314b<T> bVar) {
            return mo4874g(bVar, 0, (Object) null);
        }

        /* renamed from: g */
        public <T> C32487a<T> mo4874g(C1314b<T> bVar, long j, T t) {
            long j2 = 0;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    j2 = SystemClock.elapsedRealtime();
                }
                return CallbackToFutureAdapter.m74987a(new C1712w1(this, bVar, j2, j, t));
            }
            throw new IllegalArgumentException("Invalid timeout value: " + j);
        }

        /* renamed from: h */
        public final void mo4875h(@C0359n0 C1456h hVar) {
            synchronized (this.f3783a) {
                Iterator it = new HashSet(this.f3783a).iterator();
                HashSet hashSet = null;
                while (it.hasNext()) {
                    C1315c cVar = (C1315c) it.next();
                    if (cVar.mo4876a(hVar)) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(cVar);
                    }
                }
                if (hashSet != null) {
                    this.f3783a.removeAll(hashSet);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$l */
    public @interface C1316l {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.ImageCapture$m */
    public static final class C1317m implements C1437b0<C1475l0> {

        /* renamed from: a */
        public static final int f3790a = 4;

        /* renamed from: b */
        public static final int f3791b = 0;

        /* renamed from: c */
        public static final C1475l0 f3792c = new C1311j().mo4866s(4).mo4861n(0).mo4862o();

        @C0359n0
        /* renamed from: b */
        public C1475l0 mo4877a() {
            return f3792c;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$n */
    public @interface C1318n {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$o */
    public @interface C1319o {
    }

    @C0344h1
    /* renamed from: androidx.camera.core.ImageCapture$p */
    public static class C1320p {

        /* renamed from: a */
        public final int f3793a;
        @C0337f0(from = 1, mo995to = 100)

        /* renamed from: b */
        public final int f3794b;

        /* renamed from: c */
        public final Rational f3795c;
        @C0359n0

        /* renamed from: d */
        public final Executor f3796d;
        @C0359n0

        /* renamed from: e */
        public final C1325s f3797e;

        /* renamed from: f */
        public AtomicBoolean f3798f = new AtomicBoolean(false);

        /* renamed from: g */
        public final Rect f3799g;

        public C1320p(int i, @C0337f0(from = 1, mo995to = 100) int i2, Rational rational, @C0363p0 Rect rect, @C0359n0 Executor executor, @C0359n0 C1325s sVar) {
            boolean z = false;
            this.f3793a = i;
            this.f3794b = i2;
            if (rational != null) {
                C18001r.m81765b(!rational.isZero(), "Target ratio cannot be zero");
                C18001r.m81765b(rational.floatValue() > 0.0f ? true : z, "Target ratio must be positive");
            }
            this.f3795c = rational;
            this.f3799g = rect;
            this.f3796d = executor;
            this.f3797e = sVar;
        }

        @C0359n0
        /* renamed from: d */
        public static Rect m5543d(@C0359n0 Rect rect, int i, @C0359n0 Size size, int i2) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) (i2 - i));
            float[] m = ImageUtil.m6673m(size);
            matrix.mapPoints(m);
            matrix.postTranslate(-ImageUtil.m6670j(m[0], m[2], m[4], m[6]), -ImageUtil.m6670j(m[1], m[3], m[5], m[7]));
            matrix.invert(matrix);
            RectF rectF = new RectF();
            matrix.mapRect(rectF, new RectF(rect));
            rectF.sort();
            Rect rect2 = new Rect();
            rectF.round(rect2);
            return rect2;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m5544e(C1353a2 a2Var) {
            this.f3797e.mo4822a(a2Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m5545f(int i, String str, Throwable th) {
            this.f3797e.mo4823b(new ImageCaptureException(i, str, th));
        }

        /* renamed from: c */
        public void mo4879c(C1353a2 a2Var) {
            int i;
            Size size;
            if (!this.f3798f.compareAndSet(false, true)) {
                a2Var.close();
                return;
            }
            if (new C1607a().mo5598b(a2Var)) {
                try {
                    ByteBuffer e = a2Var.mo4911o2()[0].mo4906e();
                    e.rewind();
                    byte[] bArr = new byte[e.capacity()];
                    e.get(bArr);
                    C1516d j = C1516d.m6382j(new ByteArrayInputStream(bArr));
                    e.rewind();
                    size = new Size(j.mo5410t(), j.mo5404n());
                    i = j.mo5408r();
                } catch (IOException e2) {
                    mo4880g(1, "Unable to parse JPEG exif", e2);
                    a2Var.close();
                    return;
                }
            } else {
                size = new Size(a2Var.getWidth(), a2Var.getHeight());
                i = this.f3793a;
            }
            C1379c3 c3Var = new C1379c3(a2Var, size, C1412h2.m5903d(a2Var.mo4977q3().mo5101b(), a2Var.mo4977q3().getTimestamp(), i));
            Rect rect = this.f3799g;
            if (rect != null) {
                c3Var.mo4978y1(m5543d(rect, this.f3793a, size, i));
            } else {
                Rational rational = this.f3795c;
                if (rational != null) {
                    if (i % 180 != 0) {
                        rational = new Rational(this.f3795c.getDenominator(), this.f3795c.getNumerator());
                    }
                    Size size2 = new Size(c3Var.getWidth(), c3Var.getHeight());
                    if (ImageUtil.m6667g(size2, rational)) {
                        c3Var.mo4978y1(ImageUtil.m6661a(size2, rational));
                    }
                }
            }
            try {
                this.f3796d.execute(new C1726y1(this, c3Var));
            } catch (RejectedExecutionException unused) {
                C1417i2.m5913c(ImageCapture.f3733T, "Unable to post to the supplied executor.");
                a2Var.close();
            }
        }

        /* renamed from: g */
        public void mo4880g(int i, String str, Throwable th) {
            if (this.f3798f.compareAndSet(false, true)) {
                try {
                    this.f3796d.execute(new C1718x1(this, i, str, th));
                } catch (RejectedExecutionException unused) {
                    C1417i2.m5913c(ImageCapture.f3733T, "Unable to post to the supplied executor.");
                }
            }
        }
    }

    @C0344h1
    /* renamed from: androidx.camera.core.ImageCapture$q */
    public static class C1321q implements C1663p0.C1664a {
        @C0323b0("mLock")

        /* renamed from: a */
        public final Deque<C1320p> f3800a = new ArrayDeque();
        @C0323b0("mLock")

        /* renamed from: b */
        public C1320p f3801b = null;
        @C0323b0("mLock")

        /* renamed from: c */
        public C32487a<C1353a2> f3802c = null;
        @C0323b0("mLock")

        /* renamed from: d */
        public int f3803d = 0;
        @C0323b0("mLock")

        /* renamed from: e */
        public final C1323b f3804e;

        /* renamed from: f */
        public final int f3805f;

        /* renamed from: g */
        public final Object f3806g = new Object();

        /* renamed from: androidx.camera.core.ImageCapture$q$a */
        public class C1322a implements C1544c<C1353a2> {

            /* renamed from: a */
            public final /* synthetic */ C1320p f3807a;

            public C1322a(C1320p pVar) {
                this.f3807a = pVar;
            }

            /* renamed from: b */
            public void mo4161b(Throwable th) {
                String str;
                synchronized (C1321q.this.f3806g) {
                    if (!(th instanceof CancellationException)) {
                        C1320p pVar = this.f3807a;
                        int n0 = ImageCapture.m5423n0(th);
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "Unknown error";
                        }
                        pVar.mo4880g(n0, str, th);
                    }
                    C1321q qVar = C1321q.this;
                    qVar.f3801b = null;
                    qVar.f3802c = null;
                    qVar.mo4883c();
                }
            }

            /* renamed from: c */
            public void mo4160a(@C0363p0 C1353a2 a2Var) {
                synchronized (C1321q.this.f3806g) {
                    C18001r.m81775l(a2Var);
                    C1393e3 e3Var = new C1393e3(a2Var);
                    e3Var.mo5656a(C1321q.this);
                    C1321q.this.f3803d++;
                    this.f3807a.mo4879c(e3Var);
                    C1321q qVar = C1321q.this;
                    qVar.f3801b = null;
                    qVar.f3802c = null;
                    qVar.mo4883c();
                }
            }
        }

        /* renamed from: androidx.camera.core.ImageCapture$q$b */
        public interface C1323b {
            @C0359n0
            /* renamed from: a */
            C32487a<C1353a2> mo4886a(@C0359n0 C1320p pVar);
        }

        public C1321q(int i, @C0359n0 C1323b bVar) {
            this.f3805f = i;
            this.f3804e = bVar;
        }

        /* renamed from: a */
        public void mo4881a(@C0359n0 Throwable th) {
            C1320p pVar;
            C32487a<C1353a2> aVar;
            ArrayList<C1320p> arrayList;
            synchronized (this.f3806g) {
                pVar = this.f3801b;
                this.f3801b = null;
                aVar = this.f3802c;
                this.f3802c = null;
                arrayList = new ArrayList<>(this.f3800a);
                this.f3800a.clear();
            }
            if (!(pVar == null || aVar == null)) {
                pVar.mo4880g(ImageCapture.m5423n0(th), th.getMessage(), th);
                aVar.cancel(true);
            }
            for (C1320p g : arrayList) {
                g.mo4880g(ImageCapture.m5423n0(th), th.getMessage(), th);
            }
        }

        /* renamed from: b */
        public void mo4882b(C1353a2 a2Var) {
            synchronized (this.f3806g) {
                this.f3803d--;
                mo4883c();
            }
        }

        /* renamed from: c */
        public void mo4883c() {
            synchronized (this.f3806g) {
                if (this.f3801b == null) {
                    if (this.f3803d >= this.f3805f) {
                        C1417i2.m5924n(ImageCapture.f3733T, "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    C1320p poll = this.f3800a.poll();
                    if (poll != null) {
                        this.f3801b = poll;
                        C32487a<C1353a2> a = this.f3804e.mo4886a(poll);
                        this.f3802c = a;
                        C1548f.m6473b(a, new C1322a(poll), C1525a.m6437a());
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo4884d(@C0359n0 C1320p pVar) {
            int i;
            synchronized (this.f3806g) {
                this.f3800a.offer(pVar);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                if (this.f3801b != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(this.f3800a.size());
                C1417i2.m5911a(ImageCapture.f3733T, String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                mo4883c();
            }
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$r */
    public static final class C1324r {

        /* renamed from: a */
        public boolean f3809a;

        /* renamed from: b */
        public boolean f3810b = false;

        /* renamed from: c */
        public boolean f3811c;
        @C0363p0

        /* renamed from: d */
        public Location f3812d;

        @C0363p0
        /* renamed from: a */
        public Location mo4887a() {
            return this.f3812d;
        }

        /* renamed from: b */
        public boolean mo4888b() {
            return this.f3809a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: c */
        public boolean mo4889c() {
            return this.f3810b;
        }

        /* renamed from: d */
        public boolean mo4890d() {
            return this.f3811c;
        }

        /* renamed from: e */
        public void mo4891e(@C0363p0 Location location) {
            this.f3812d = location;
        }

        /* renamed from: f */
        public void mo4892f(boolean z) {
            this.f3809a = z;
            this.f3810b = true;
        }

        /* renamed from: g */
        public void mo4893g(boolean z) {
            this.f3811c = z;
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$s */
    public static abstract class C1325s {
        /* renamed from: a */
        public void mo4822a(@C0359n0 C1353a2 a2Var) {
        }

        /* renamed from: b */
        public void mo4823b(@C0359n0 ImageCaptureException imageCaptureException) {
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$t */
    public interface C1326t {
        /* renamed from: a */
        void mo4894a(@C0359n0 C1329v vVar);

        /* renamed from: b */
        void mo4895b(@C0359n0 ImageCaptureException imageCaptureException);
    }

    /* renamed from: androidx.camera.core.ImageCapture$u */
    public static final class C1327u {
        @C0363p0

        /* renamed from: a */
        public final File f3813a;
        @C0363p0

        /* renamed from: b */
        public final ContentResolver f3814b;
        @C0363p0

        /* renamed from: c */
        public final Uri f3815c;
        @C0363p0

        /* renamed from: d */
        public final ContentValues f3816d;
        @C0363p0

        /* renamed from: e */
        public final OutputStream f3817e;
        @C0359n0

        /* renamed from: f */
        public final C1324r f3818f;

        public C1327u(@C0363p0 File file, @C0363p0 ContentResolver contentResolver, @C0363p0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 OutputStream outputStream, @C0363p0 C1324r rVar) {
            this.f3813a = file;
            this.f3814b = contentResolver;
            this.f3815c = uri;
            this.f3816d = contentValues;
            this.f3817e = outputStream;
            this.f3818f = rVar == null ? new C1324r() : rVar;
        }

        @C0363p0
        /* renamed from: a */
        public ContentResolver mo4896a() {
            return this.f3814b;
        }

        @C0363p0
        /* renamed from: b */
        public ContentValues mo4897b() {
            return this.f3816d;
        }

        @C0363p0
        /* renamed from: c */
        public File mo4898c() {
            return this.f3813a;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public C1324r mo4899d() {
            return this.f3818f;
        }

        @C0363p0
        /* renamed from: e */
        public OutputStream mo4900e() {
            return this.f3817e;
        }

        @C0363p0
        /* renamed from: f */
        public Uri mo4901f() {
            return this.f3815c;
        }

        /* renamed from: androidx.camera.core.ImageCapture$u$a */
        public static final class C1328a {
            @C0363p0

            /* renamed from: a */
            public File f3819a;
            @C0363p0

            /* renamed from: b */
            public ContentResolver f3820b;
            @C0363p0

            /* renamed from: c */
            public Uri f3821c;
            @C0363p0

            /* renamed from: d */
            public ContentValues f3822d;
            @C0363p0

            /* renamed from: e */
            public OutputStream f3823e;
            @C0363p0

            /* renamed from: f */
            public C1324r f3824f;

            public C1328a(@C0359n0 File file) {
                this.f3819a = file;
            }

            @C0359n0
            /* renamed from: a */
            public C1327u mo4902a() {
                return new C1327u(this.f3819a, this.f3820b, this.f3821c, this.f3822d, this.f3823e, this.f3824f);
            }

            @C0359n0
            /* renamed from: b */
            public C1328a mo4903b(@C0359n0 C1324r rVar) {
                this.f3824f = rVar;
                return this;
            }

            public C1328a(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 ContentValues contentValues) {
                this.f3820b = contentResolver;
                this.f3821c = uri;
                this.f3822d = contentValues;
            }

            public C1328a(@C0359n0 OutputStream outputStream) {
                this.f3823e = outputStream;
            }
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$v */
    public static class C1329v {
        @C0363p0

        /* renamed from: a */
        public Uri f3825a;

        public C1329v(@C0363p0 Uri uri) {
            this.f3825a = uri;
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo4904a() {
            return this.f3825a;
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$w */
    public static final class C1330w {

        /* renamed from: a */
        public C1456h f3826a = C1456h.C1457a.m6110h();

        /* renamed from: b */
        public boolean f3827b = false;

        /* renamed from: c */
        public boolean f3828c = false;

        /* renamed from: d */
        public boolean f3829d = false;
    }

    public ImageCapture(@C0359n0 C1475l0 l0Var) {
        super(l0Var);
        C1475l0 l0Var2 = (C1475l0) mo4955f();
        if (l0Var2.mo5126c(C1475l0.f4236w)) {
            this.f3751o = l0Var2.mo5247d0();
        } else {
            this.f3751o = 1;
        }
        Executor executor = (Executor) C18001r.m81775l(l0Var2.mo5241J(C1525a.m6439c()));
        this.f3750n = executor;
        this.f3747G = C1525a.m6444h(executor);
        if (this.f3751o == 0) {
            this.f3752p = true;
        } else {
            this.f3752p = false;
        }
    }

    /* renamed from: A0 */
    public static /* synthetic */ Void m5385A0(List list) {
        return null;
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m5386B0(C1500r0 r0Var) {
        C1353a2 c;
        try {
            c = r0Var.mo5003c();
            StringBuilder sb = new StringBuilder();
            sb.append("Discarding ImageProxy which was inadvertently acquired: ");
            sb.append(c);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (IllegalStateException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ Object m5388D0(C1330w wVar, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        CameraControlInternal d = mo4953d();
        wVar.f3827b = true;
        d.mo4682h(true).mo5489q(new C1707v1(aVar), C1525a.m6437a());
        return "openTorch";
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ C32487a m5389E0(C1330w wVar, C1456h hVar) throws Exception {
        wVar.f3826a = hVar;
        mo4796d1(wVar);
        if (!mo4814t0(wVar)) {
            return C1548f.m6479h(null);
        }
        if (this.f3762z) {
            return mo4784R0(wVar);
        }
        return mo4794b1(wVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ C32487a m5390F0(C1330w wVar, Void voidR) throws Exception {
        return mo4802g0(wVar);
    }

    /* renamed from: G0 */
    public static /* synthetic */ Void m5391G0(Boolean bool) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ void m5392H0(C1325s sVar) {
        sVar.mo4823b(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ Object m5397K0(C1320p pVar, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3742B.mo5007f(new C1377c1(aVar), C1525a.m6441e());
        C1330w wVar = new C1330w();
        C1545d<T> f = C1545d.m6463b(mo4786T0(wVar)).mo5486f(new C1383d1(this, pVar), this.f3756t);
        C1548f.m6473b(f, new C1305d(wVar, aVar), this.f3756t);
        aVar.mo48123a(new C1391e1(f), C1525a.m6437a());
        return "takePictureInternal";
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m5399L0(CallbackToFutureAdapter.C16559a aVar, C1500r0 r0Var) {
        try {
            C1353a2 c = r0Var.mo5003c();
            if (c == null) {
                aVar.mo48128f(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.mo48125c(c)) {
                c.close();
            }
        } catch (IllegalStateException e) {
            aVar.mo48128f(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ C32487a m5401M0(C1320p pVar, Void voidR) throws Exception {
        return mo4816u0(pVar);
    }

    /* renamed from: O0 */
    public static /* synthetic */ Void m5405O0(C1456h hVar) {
        return null;
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m5407P0() {
    }

    /* renamed from: k0 */
    public static boolean m5422k0(@C0359n0 C1582x0 x0Var) {
        boolean z;
        Config.C1421a<Boolean> aVar = C1475l0.f4235D;
        Boolean bool = Boolean.FALSE;
        boolean z2 = false;
        if (((Boolean) x0Var.mo5131h(aVar, bool)).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                C1417i2.m5924n(f3733T, "Software JPEG only supported on API 26+, but current API level is " + i);
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) x0Var.mo5131h(C1475l0.f4232A, null);
            if (!(num == null || num.intValue() == 256)) {
                C1417i2.m5924n(f3733T, "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (x0Var.mo5131h(C1475l0.f4239z, null) != null) {
                C1417i2.m5924n(f3733T, "CaptureProcessor is set, unable to use software JPEG.");
            } else {
                z2 = z;
            }
            if (!z2) {
                C1417i2.m5924n(f3733T, "Unable to support software JPEG. Disabling.");
                x0Var.mo5545t(aVar, bool);
            }
        }
        return z2;
    }

    /* renamed from: n0 */
    public static int m5423n0(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof CaptureFailedException) {
            return 2;
        }
        return 0;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m5424v0() {
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m5425w0(C1618i iVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            iVar.mo5607d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m5427y0(String str, C1475l0 l0Var, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        mo4803h0();
        if (mo4962o(str)) {
            SessionConfig.C1424b j0 = mo4805j0(str, l0Var, size);
            this.f3741A = j0;
            mo4948H(j0.mo5166n());
            mo4966s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ Object m5428z0(C1583y.C1584a aVar, List list, C1430a0 a0Var, CallbackToFutureAdapter.C16559a aVar2) throws Exception {
        aVar.mo5555c(new C1309h(aVar2));
        list.add(aVar.mo5560h());
        return "issueTakePicture[stage=" + a0Var.getId() + "]";
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.camera.core.m0, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.C0359n0
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C1488o1<?> mo4780A(@androidx.annotation.C0359n0 androidx.camera.core.impl.C1496q r8, @androidx.annotation.C0359n0 androidx.camera.core.impl.C1488o1.C1489a<?, ?, ?> r9) {
        /*
            r7 = this;
            androidx.camera.core.impl.f1 r8 = r8.mo4596f()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.f> r0 = androidx.camera.core.internal.compat.quirk.C1604f.class
            boolean r8 = r8.mo5219a(r0)
            if (r8 == 0) goto L_0x0034
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Boolean> r0 = androidx.camera.core.impl.C1475l0.f4235D
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.mo5131h(r0, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r2 = "ImageCapture"
            if (r8 != 0) goto L_0x0028
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.C1417i2.m5924n(r2, r8)
            goto L_0x0034
        L_0x0028:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.C1417i2.m5915e(r2, r8)
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            r8.mo5545t(r0, r1)
        L_0x0034:
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            boolean r8 = m5422k0(r8)
            androidx.camera.core.impl.x0 r0 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r1 = androidx.camera.core.impl.C1475l0.f4232A
            r2 = 0
            java.lang.Object r0 = r0.mo5131h(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            r3 = 35
            r4 = 1
            if (r0 == 0) goto L_0x0078
            androidx.camera.core.impl.x0 r5 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<androidx.camera.core.impl.z> r6 = androidx.camera.core.impl.C1475l0.f4239z
            java.lang.Object r2 = r5.mo5131h(r6, r2)
            if (r2 != 0) goto L_0x005d
            r2 = r4
            goto L_0x005e
        L_0x005d:
            r2 = r1
        L_0x005e:
            java.lang.String r5 = "Cannot set buffer format with CaptureProcessor defined."
            androidx.core.util.C18001r.m81765b(r2, r5)
            androidx.camera.core.impl.x0 r2 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r5 = androidx.camera.core.impl.C1487o0.f4249c
            if (r8 == 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            int r3 = r0.intValue()
        L_0x0070:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r2.mo5545t(r5, r8)
            goto L_0x00a4
        L_0x0078:
            androidx.camera.core.impl.x0 r0 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<androidx.camera.core.impl.z> r5 = androidx.camera.core.impl.C1475l0.f4239z
            java.lang.Object r0 = r0.mo5131h(r5, r2)
            if (r0 != 0) goto L_0x0097
            if (r8 == 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r0 = androidx.camera.core.impl.C1487o0.f4249c
            r2 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.mo5545t(r0, r2)
            goto L_0x00a4
        L_0x0097:
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r0 = androidx.camera.core.impl.C1487o0.f4249c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r8.mo5545t(r0, r2)
        L_0x00a4:
            androidx.camera.core.impl.x0 r8 = r9.mo4099h()
            androidx.camera.core.impl.Config$a<java.lang.Integer> r0 = androidx.camera.core.impl.C1475l0.f4233B
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.mo5131h(r0, r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r4) goto L_0x00bc
            r1 = r4
        L_0x00bc:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            androidx.core.util.C18001r.m81765b(r1, r8)
            androidx.camera.core.impl.o1 r8 = r9.mo4862o()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.mo4780A(androidx.camera.core.impl.q, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    @C0341g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public void mo4781C() {
        mo4797e0();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public Size mo4782D(@C0359n0 Size size) {
        SessionConfig.C1424b j0 = mo4805j0(mo4954e(), (C1475l0) mo4955f(), size);
        this.f3741A = j0;
        mo4948H(j0.mo5166n());
        mo4964q();
        return size;
    }

    /* renamed from: Q0 */
    public final void mo4783Q0() {
        synchronized (this.f3753q) {
            if (this.f3753q.get() == null) {
                this.f3753q.set(Integer.valueOf(mo4809o0()));
            }
        }
    }

    @C0359n0
    /* renamed from: R0 */
    public final C32487a<Void> mo4784R0(@C0359n0 C1330w wVar) {
        CameraInternal c = mo4952c();
        if (c != null && c.mo5121c().mo4598h().mo4610f().intValue() == 1) {
            return C1548f.m6479h(null);
        }
        C1417i2.m5911a(f3733T, "openTorch");
        return CallbackToFutureAdapter.m74987a(new C1671q1(this, wVar));
    }

    /* renamed from: S0 */
    public void mo4785S0(C1330w wVar) {
        mo4804i0(wVar);
        mo4799f0(wVar);
        mo4800f1();
    }

    /* renamed from: T0 */
    public final C32487a<Void> mo4786T0(C1330w wVar) {
        mo4783Q0();
        return C1545d.m6463b(mo4811q0()).mo5486f(new C1400f1(this, wVar), this.f3756t).mo5486f(new C1406g1(this, wVar), this.f3756t).mo5485e(new C1411h1(), this.f3756t);
    }

    @C0341g1
    /* renamed from: U0 */
    public final void mo4787U0(@C0359n0 Executor executor, @C0359n0 C1325s sVar) {
        CameraInternal c = mo4952c();
        if (c == null) {
            executor.execute(new C1644m1(this, sVar));
        } else {
            this.f3746F.mo4884d(new C1320p(mo4958j(c), mo4810p0(), this.f3755s, mo4961n(), executor, sVar));
        }
    }

    /* renamed from: V0 */
    public void mo4788V0(@C0359n0 Rational rational) {
        this.f3755s = rational;
    }

    /* renamed from: W0 */
    public void mo4789W0(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.f3753q) {
                this.f3754r = i;
                mo4798e1();
            }
            return;
        }
        throw new IllegalArgumentException("Invalid flash mode: " + i);
    }

    /* renamed from: X0 */
    public void mo4790X0(int i) {
        int r0 = mo4812r0();
        if (mo4946F(i) && this.f3755s != null) {
            this.f3755s = ImageUtil.m6663c(Math.abs(C1515c.m6375c(i) - C1515c.m6375c(r0)), this.f3755s);
        }
    }

    /* renamed from: Y0 */
    public void m5395J0(@C0359n0 C1327u uVar, @C0359n0 Executor executor, @C0359n0 C1326t tVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C1525a.m6441e().execute(new C1658o1(this, uVar, executor, tVar));
            return;
        }
        mo4787U0(C1525a.m6441e(), new C1304c(uVar, executor, new C1303b(tVar), tVar));
    }

    /* renamed from: Z0 */
    public void m5393I0(@C0359n0 Executor executor, @C0359n0 C1325s sVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C1525a.m6441e().execute(new C1653n1(this, executor, sVar));
        } else {
            mo4787U0(executor, sVar);
        }
    }

    /* renamed from: a1 */
    public final C32487a<C1353a2> m5426x0(@C0359n0 C1320p pVar) {
        return CallbackToFutureAdapter.m74987a(new C1416i1(this, pVar));
    }

    /* renamed from: b1 */
    public C32487a<Void> mo4794b1(C1330w wVar) {
        C1417i2.m5911a(f3733T, "triggerAePrecapture");
        wVar.f3829d = true;
        return C1548f.m6486o(mo4953d().mo4676b(), new C1665p1(), C1525a.m6437a());
    }

    /* renamed from: c1 */
    public final void mo4795c1(C1330w wVar) {
        C1417i2.m5911a(f3733T, "triggerAf");
        wVar.f3828c = true;
        mo4953d().mo4690l().mo5489q(new C1702u1(), C1525a.m6437a());
    }

    /* renamed from: d1 */
    public void mo4796d1(C1330w wVar) {
        if (this.f3752p && wVar.f3826a.mo4464f() == CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO && wVar.f3826a.mo4462d() == CameraCaptureMetaData.AfState.INACTIVE) {
            mo4795c1(wVar);
        }
    }

    /* renamed from: e0 */
    public final void mo4797e0() {
        this.f3746F.mo4881a(new CameraClosedException("Camera is closed."));
    }

    /* renamed from: e1 */
    public final void mo4798e1() {
        synchronized (this.f3753q) {
            if (this.f3753q.get() == null) {
                mo4953d().mo4681g(mo4809o0());
            }
        }
    }

    /* renamed from: f0 */
    public void mo4799f0(C1330w wVar) {
        if (wVar.f3828c || wVar.f3829d) {
            mo4953d().mo4692m(wVar.f3828c, wVar.f3829d);
            wVar.f3828c = false;
            wVar.f3829d = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4800f1() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.f3753q
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.f3753q     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.mo4809o0()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.mo4798e1()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.mo4800f1():void");
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C1488o1<?> mo4801g(boolean z, @C0359n0 UseCaseConfigFactory useCaseConfigFactory) {
        Config a = useCaseConfigFactory.mo4721a(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
        if (z) {
            a = Config.m5971R(a, f3732S.mo4877a());
        }
        if (a == null) {
            return null;
        }
        return mo4807m(a).mo4862o();
    }

    /* renamed from: g0 */
    public C32487a<Boolean> mo4802g0(C1330w wVar) {
        long j;
        if (!this.f3752p && !wVar.f3829d && !wVar.f3827b) {
            return C1548f.m6479h(Boolean.FALSE);
        }
        if (wVar.f3829d || wVar.f3827b) {
            j = 5000;
        } else {
            j = 1000;
        }
        return this.f3748l.mo4874g(new C1308g(), j, Boolean.FALSE);
    }

    @C0341g1
    /* renamed from: h0 */
    public void mo4803h0() {
        C1566j.m6506b();
        DeferrableSurface deferrableSurface = this.f3745E;
        this.f3745E = null;
        this.f3742B = null;
        this.f3743C = null;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
    }

    /* renamed from: i0 */
    public final void mo4804i0(@C0359n0 C1330w wVar) {
        if (wVar.f3827b) {
            CameraControlInternal d = mo4953d();
            wVar.f3827b = false;
            d.mo4682h(false).mo5489q(new C1637l1(), C1525a.m6437a());
        }
    }

    @C0341g1
    /* renamed from: j0 */
    public SessionConfig.C1424b mo4805j0(@C0359n0 String str, @C0359n0 C1475l0 l0Var, @C0359n0 Size size) {
        int i;
        C1618i iVar;
        C1618i iVar2;
        boolean z;
        C1566j.m6506b();
        SessionConfig.C1424b p = SessionConfig.C1424b.m6009p(l0Var);
        p.mo5162j(this.f3748l);
        if (l0Var.mo5252i0() != null) {
            this.f3742B = new C1362b3(l0Var.mo5252i0().mo5075a(size.getWidth(), size.getHeight(), mo4956h(), 2, 0));
            this.f3744D = new C1302a();
        } else {
            C1587z zVar = this.f3760x;
            if (zVar != null || this.f3761y) {
                int h = mo4956h();
                int h2 = mo4956h();
                if (this.f3761y) {
                    if (this.f3760x == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18001r.m81778o(z, "CaptureProcessor should not be set if software JPEG is to be used.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        C1417i2.m5915e(f3733T, "Using software JPEG encoder.");
                        iVar2 = new C1618i(mo4810p0(), this.f3759w);
                        iVar = iVar2;
                        i = 256;
                    } else {
                        throw new IllegalStateException("Software JPEG only supported on API 26+");
                    }
                } else {
                    iVar = zVar;
                    i = h2;
                    iVar2 = null;
                }
                C1695t2 t2Var = new C1695t2(size.getWidth(), size.getHeight(), h, this.f3759w, this.f3756t, mo4806l0(C1375c0.m5855c()), iVar, i);
                this.f3743C = t2Var;
                this.f3744D = t2Var.mo5734h();
                this.f3742B = new C1362b3(this.f3743C);
                if (iVar2 != null) {
                    this.f3743C.mo5735i().mo5489q(new C1676r1(iVar2), C1525a.m6437a());
                }
            } else {
                C1638l2 l2Var = new C1638l2(size.getWidth(), size.getHeight(), mo4956h(), 2);
                this.f3744D = l2Var.mo5619m();
                this.f3742B = new C1362b3(l2Var);
            }
        }
        this.f3746F = new C1321q(2, new C1685s1(this));
        this.f3742B.mo5007f(this.f3749m, C1525a.m6441e());
        C1362b3 b3Var = this.f3742B;
        DeferrableSurface deferrableSurface = this.f3745E;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        C1503s0 s0Var = new C1503s0(this.f3742B.mo5002a());
        this.f3745E = s0Var;
        C32487a<Void> f = s0Var.mo5139f();
        Objects.requireNonNull(b3Var);
        f.mo5489q(new C1670q0(b3Var), C1525a.m6441e());
        p.mo5161i(this.f3745E);
        String str2 = str;
        p.mo5159g(new C1694t1(this, str, l0Var, size));
        return p;
    }

    /* renamed from: l0 */
    public final C1581x mo4806l0(C1581x xVar) {
        List<C1430a0> a = this.f3758v.mo5074a();
        if (a == null || a.isEmpty()) {
            return xVar;
        }
        return C1375c0.m5853a(a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: m */
    public C1488o1.C1489a<?, ?, ?> mo4807m(@C0359n0 Config config) {
        return C1311j.m5482u(config);
    }

    /* renamed from: m0 */
    public int mo4808m0() {
        return this.f3751o;
    }

    /* renamed from: o0 */
    public int mo4809o0() {
        int i;
        synchronized (this.f3753q) {
            i = this.f3754r;
            if (i == -1) {
                i = ((C1475l0) mo4955f()).mo5251h0(2);
            }
        }
        return i;
    }

    @C0337f0(from = 1, mo995to = 100)
    /* renamed from: p0 */
    public final int mo4810p0() {
        int i = this.f3751o;
        if (i == 0) {
            return 100;
        }
        if (i == 1) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f3751o + " is invalid");
    }

    /* renamed from: q0 */
    public final C32487a<C1456h> mo4811q0() {
        if (this.f3752p || mo4809o0() == 0) {
            return this.f3748l.mo4873f(new C1307f());
        }
        return C1548f.m6479h(null);
    }

    /* renamed from: r0 */
    public int mo4812r0() {
        return mo4960l();
    }

    /* renamed from: s0 */
    public boolean mo4813s0(C1456h hVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (hVar == null) {
            return false;
        }
        if (hVar.mo4464f() == CameraCaptureMetaData.AfMode.OFF || hVar.mo4464f() == CameraCaptureMetaData.AfMode.UNKNOWN || hVar.mo4462d() == CameraCaptureMetaData.AfState.PASSIVE_FOCUSED || hVar.mo4462d() == CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED || hVar.mo4462d() == CameraCaptureMetaData.AfState.LOCKED_FOCUSED || hVar.mo4462d() == CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.mo4465g() == CameraCaptureMetaData.AeState.CONVERGED || hVar.mo4465g() == CameraCaptureMetaData.AeState.FLASH_REQUIRED || hVar.mo4465g() == CameraCaptureMetaData.AeState.UNKNOWN) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hVar.mo4463e() == CameraCaptureMetaData.AwbState.CONVERGED || hVar.mo4463e() == CameraCaptureMetaData.AwbState.UNKNOWN) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: t0 */
    public boolean mo4814t0(@C0359n0 C1330w wVar) {
        int o0 = mo4809o0();
        if (o0 != 0) {
            if (o0 == 1) {
                return true;
            }
            if (o0 == 2) {
                return false;
            }
            throw new AssertionError(mo4809o0());
        } else if (wVar.f3826a.mo4465g() == CameraCaptureMetaData.AeState.FLASH_REQUIRED) {
            return true;
        } else {
            return false;
        }
    }

    @C0359n0
    public String toString() {
        return "ImageCapture:" + mo4957i();
    }

    /* renamed from: u0 */
    public C32487a<Void> mo4816u0(@C0359n0 C1320p pVar) {
        C1581x xVar;
        C1417i2.m5911a(f3733T, "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        if (this.f3743C != null) {
            if (this.f3761y) {
                xVar = mo4806l0(C1375c0.m5855c());
                if (xVar.mo5074a().size() > 1) {
                    return C1548f.m6477f(new IllegalArgumentException("Software JPEG not supported with CaptureBundle size > 1."));
                }
            } else {
                xVar = mo4806l0((C1581x) null);
            }
            if (xVar == null) {
                return C1548f.m6477f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (xVar.mo5074a().size() > this.f3759w) {
                return C1548f.m6477f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.f3743C.mo5738m(xVar);
            str = this.f3743C.mo5736j();
        } else {
            xVar = mo4806l0(C1375c0.m5855c());
            if (xVar.mo5074a().size() > 1) {
                return C1548f.m6477f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
        }
        for (C1430a0 next : xVar.mo5074a()) {
            C1583y.C1584a aVar = new C1583y.C1584a();
            aVar.mo5569s(this.f3757u.mo5551f());
            aVar.mo5557e(this.f3757u.mo5548c());
            aVar.mo5553a(this.f3741A.mo5168q());
            aVar.mo5558f(this.f3745E);
            if (new C1607a().mo5597a()) {
                aVar.mo5556d(C1583y.f4496g, Integer.valueOf(pVar.f3793a));
            }
            aVar.mo5556d(C1583y.f4497h, Integer.valueOf(pVar.f3794b));
            aVar.mo5557e(next.mo5184a().mo5548c());
            if (str != null) {
                aVar.mo5559g(str, Integer.valueOf(next.getId()));
            }
            aVar.mo5555c(this.f3744D);
            arrayList.add(CallbackToFutureAdapter.m74987a(new C1626j1(this, aVar, arrayList2, next)));
        }
        mo4953d().mo4698p(arrayList2);
        return C1548f.m6486o(C1548f.m6474c(arrayList), new C1632k1(), C1525a.m6437a());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public void mo4817w() {
        C1475l0 l0Var = (C1475l0) mo4955f();
        this.f3757u = C1583y.C1584a.m6552j(l0Var).mo5560h();
        this.f3760x = l0Var.mo5249f0((C1587z) null);
        this.f3759w = l0Var.mo5254k0(2);
        this.f3758v = l0Var.mo5246c0(C1375c0.m5855c());
        this.f3761y = l0Var.mo5256m0();
        CameraInternal c = mo4952c();
        C18001r.m81776m(c, "Attached camera cannot be null");
        boolean a = c.mo4139l().mo4596f().mo5219a(C1605g.class);
        this.f3762z = a;
        if (a) {
            C1417i2.m5911a(f3733T, "Open and close torch to replace the flash fired by flash mode.");
        }
        this.f3756t = Executors.newFixedThreadPool(1, new C1306e());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public void mo4818x() {
        mo4798e1();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo4819z() {
        mo4797e0();
        mo4803h0();
        this.f3761y = false;
        this.f3756t.shutdown();
    }
}
