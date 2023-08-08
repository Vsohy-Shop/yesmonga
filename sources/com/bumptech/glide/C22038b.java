package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;
import com.bumptech.glide.C22040c;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C22127k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C22240i;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.load.engine.prefill.C22263b;
import com.bumptech.glide.load.engine.prefill.C22265d;
import com.bumptech.glide.load.model.C22281a;
import com.bumptech.glide.load.model.C22285b;
import com.bumptech.glide.load.model.C22292c;
import com.bumptech.glide.load.model.C22293d;
import com.bumptech.glide.load.model.C22296e;
import com.bumptech.glide.load.model.C22301f;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.load.model.C22316k;
import com.bumptech.glide.load.model.C22335s;
import com.bumptech.glide.load.model.C22358t;
import com.bumptech.glide.load.model.C22359u;
import com.bumptech.glide.load.model.C22363v;
import com.bumptech.glide.load.model.C22366w;
import com.bumptech.glide.load.model.C22371x;
import com.bumptech.glide.load.model.stream.C22341b;
import com.bumptech.glide.load.model.stream.C22345d;
import com.bumptech.glide.load.model.stream.C22347e;
import com.bumptech.glide.load.model.stream.C22349f;
import com.bumptech.glide.load.model.stream.C22356i;
import com.bumptech.glide.load.resource.bitmap.C22392a;
import com.bumptech.glide.load.resource.bitmap.C22394b;
import com.bumptech.glide.load.resource.bitmap.C22395b0;
import com.bumptech.glide.load.resource.bitmap.C22404d0;
import com.bumptech.glide.load.resource.bitmap.C22405e;
import com.bumptech.glide.load.resource.bitmap.C22408f0;
import com.bumptech.glide.load.resource.bitmap.C22410g0;
import com.bumptech.glide.load.resource.bitmap.C22416j0;
import com.bumptech.glide.load.resource.bitmap.C22418k;
import com.bumptech.glide.load.resource.bitmap.C22425l0;
import com.bumptech.glide.load.resource.bitmap.C22427m;
import com.bumptech.glide.load.resource.bitmap.C22439v;
import com.bumptech.glide.load.resource.bitmap.C22445y;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.C22447a;
import com.bumptech.glide.load.resource.drawable.C22458g;
import com.bumptech.glide.load.resource.drawable.C22466l;
import com.bumptech.glide.load.resource.drawable.C22467m;
import com.bumptech.glide.load.resource.file.C22470a;
import com.bumptech.glide.load.resource.gif.C22473a;
import com.bumptech.glide.load.resource.gif.C22477c;
import com.bumptech.glide.load.resource.gif.C22479d;
import com.bumptech.glide.load.resource.gif.C22487h;
import com.bumptech.glide.load.resource.gif.C22489j;
import com.bumptech.glide.load.resource.transcode.C22495a;
import com.bumptech.glide.load.resource.transcode.C22496b;
import com.bumptech.glide.load.resource.transcode.C22497c;
import com.bumptech.glide.load.resource.transcode.C22498d;
import com.bumptech.glide.manager.C22507d;
import com.bumptech.glide.manager.C22521q;
import com.bumptech.glide.module.C22540c;
import com.bumptech.glide.module.C22542e;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.target.C22578k;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.b */
public class C22038b implements ComponentCallbacks2 {

    /* renamed from: E0 */
    public static volatile boolean f56520E0 = false;

    /* renamed from: X */
    public static final String f56521X = "image_manager_disk_cache";

    /* renamed from: Y */
    public static final String f56522Y = "Glide";
    @C0323b0("Glide.class")

    /* renamed from: Z */
    public static volatile C22038b f56523Z;

    /* renamed from: a */
    public final C22240i f56524a;

    /* renamed from: b */
    public final C22162e f56525b;

    /* renamed from: c */
    public final C22205j f56526c;

    /* renamed from: d */
    public final C22048d f56527d;

    /* renamed from: e */
    public final Registry f56528e;

    /* renamed from: f */
    public final C22157b f56529f;

    /* renamed from: g */
    public final C22521q f56530g;

    /* renamed from: v */
    public final C22507d f56531v;
    @C0323b0("managers")

    /* renamed from: w */
    public final List<C22092j> f56532w = new ArrayList();

    /* renamed from: x */
    public final C22039a f56533x;

    /* renamed from: y */
    public MemoryCategory f56534y = MemoryCategory.NORMAL;
    @C0363p0
    @C0323b0("this")

    /* renamed from: z */
    public C22263b f56535z;

    /* renamed from: com.bumptech.glide.b$a */
    public interface C22039a {
        @C0359n0
        /* renamed from: g */
        C22561h mo65493g();
    }

    public C22038b(@C0359n0 Context context, @C0359n0 C22240i iVar, @C0359n0 C22205j jVar, @C0359n0 C22162e eVar, @C0359n0 C22157b bVar, @C0359n0 C22521q qVar, @C0359n0 C22507d dVar, int i, @C0359n0 C22039a aVar, @C0359n0 Map<Class<?>, C22096k<?, ?>> map, @C0359n0 List<C22560g<Object>> list, C22059e eVar2) {
        C22278g gVar;
        C22427m mVar;
        Registry registry;
        Context context2 = context;
        C22162e eVar3 = eVar;
        C22157b bVar2 = bVar;
        C22059e eVar4 = eVar2;
        this.f56524a = iVar;
        this.f56525b = eVar3;
        this.f56529f = bVar2;
        this.f56526c = jVar;
        this.f56530g = qVar;
        this.f56531v = dVar;
        this.f56533x = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f56528e = registry2;
        registry2.mo65459t(new DefaultImageHeaderParser());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            registry2.mo65459t(new C22445y());
        }
        List<ImageHeaderParser> g = registry2.mo65446g();
        C22473a aVar2 = new C22473a(context2, g, eVar3, bVar2);
        C22278g<ParcelFileDescriptor, Bitmap> h = VideoDecoder.m101667h(eVar);
        C22439v vVar = new C22439v(registry2.mo65446g(), resources.getDisplayMetrics(), eVar3, bVar2);
        if (i2 < 28 || !eVar4.mo65571b(C22040c.C22044d.class)) {
            C22418k kVar = new C22418k(vVar);
            gVar = new C22416j0(vVar, bVar2);
            mVar = kVar;
        } else {
            gVar = new C22404d0();
            mVar = new C22427m();
        }
        Class<Drawable> cls = Drawable.class;
        Class<ByteBuffer> cls2 = ByteBuffer.class;
        C22473a aVar3 = aVar2;
        Class<InputStream> cls3 = InputStream.class;
        if (i2 >= 28 && eVar4.mo65571b(C22040c.C22043c.class)) {
            registry2.mo65444e("Animation", cls3, cls, C22458g.m101906f(g, bVar2));
            registry2.mo65444e("Animation", cls2, cls, C22458g.m101905a(g, bVar2));
        }
        C22466l lVar = new C22466l(context2);
        C22335s.C22338c cVar = new C22335s.C22338c(resources);
        int i3 = i2;
        C22335s.C22339d dVar2 = new C22335s.C22339d(resources);
        C22335s.C22337b bVar3 = new C22335s.C22337b(resources);
        C22335s.C22339d dVar3 = dVar2;
        C22335s.C22336a aVar4 = new C22335s.C22336a(resources);
        C22405e eVar5 = new C22405e(bVar2);
        C22335s.C22337b bVar4 = bVar3;
        C22495a aVar5 = new C22495a();
        C22498d dVar4 = new C22498d();
        ContentResolver contentResolver = context.getContentResolver();
        C22335s.C22338c cVar2 = cVar;
        C22466l lVar2 = lVar;
        Class<Bitmap> cls4 = Bitmap.class;
        registry2.mo65440a(cls2, new C22292c()).mo65440a(cls3, new C22358t(bVar2)).mo65444e(Registry.f56503m, cls2, cls4, mVar).mo65444e(Registry.f56503m, cls3, cls4, gVar);
        Class<Drawable> cls5 = cls;
        Class<ParcelFileDescriptor> cls6 = ParcelFileDescriptor.class;
        if (ParcelFileDescriptorRewinder.m100728c()) {
            registry2.mo65444e(Registry.f56503m, cls6, cls4, new C22408f0(vVar));
        }
        Registry registry3 = registry2;
        Class<AssetFileDescriptor> cls7 = AssetFileDescriptor.class;
        Class<AssetFileDescriptor> cls8 = cls7;
        Class<BitmapDrawable> cls9 = BitmapDrawable.class;
        C22162e eVar6 = eVar;
        Registry b = registry2.mo65444e(Registry.f56503m, cls6, cls4, h).mo65444e(Registry.f56503m, cls7, cls4, VideoDecoder.m101662c(eVar)).mo65443d(cls4, cls4, C22363v.C22364a.m101589b()).mo65444e(Registry.f56503m, cls4, cls4, new C22425l0()).mo65441b(cls4, eVar5).mo65444e(Registry.f56504n, cls2, cls9, new C22392a(resources, mVar)).mo65444e(Registry.f56504n, cls3, cls9, new C22392a(resources, gVar)).mo65444e(Registry.f56504n, cls6, cls9, new C22392a(resources, h)).mo65441b(cls9, new C22394b(eVar6, eVar5));
        C22473a aVar6 = aVar3;
        C22489j jVar2 = new C22489j(g, aVar6, bVar2);
        Class<C22477c> cls10 = C22477c.class;
        Class<C22068a> cls11 = C22068a.class;
        Registry e = b.mo65444e("Animation", cls3, cls10, jVar2).mo65444e("Animation", cls2, cls10, aVar6).mo65441b(cls10, new C22479d()).mo65443d(cls11, cls11, C22363v.C22364a.m101589b()).mo65444e(Registry.f56503m, cls11, cls4, new C22487h(eVar6));
        Class<Uri> cls12 = Uri.class;
        C22466l lVar3 = lVar2;
        Class<Drawable> cls13 = cls5;
        Class<File> cls14 = File.class;
        e.mo65442c(cls12, cls13, lVar3).mo65442c(cls12, cls4, new C22410g0(lVar3, eVar6)).mo65460u(new C22447a.C22448a()).mo65443d(cls14, cls2, new C22293d.C22295b()).mo65443d(cls14, cls3, new C22301f.C22307e()).mo65442c(cls14, cls14, new C22470a()).mo65443d(cls14, cls6, new C22301f.C22303b()).mo65443d(cls14, cls14, C22363v.C22364a.m101589b()).mo65460u(new C22127k.C22128a(bVar2));
        if (ParcelFileDescriptorRewinder.m100728c()) {
            registry = registry3;
            registry.mo65460u(new ParcelFileDescriptorRewinder.C22110a());
        } else {
            registry = registry3;
        }
        Class cls15 = Integer.TYPE;
        C22335s.C22338c cVar3 = cVar2;
        C22335s.C22337b bVar5 = bVar4;
        Class<C22477c> cls16 = cls10;
        Class<Integer> cls17 = Integer.class;
        Registry d = registry.mo65443d(cls15, cls3, cVar3).mo65443d(cls15, cls6, bVar5).mo65443d(cls17, cls3, cVar3).mo65443d(cls17, cls6, bVar5);
        C22335s.C22339d dVar5 = dVar3;
        C22335s.C22336a aVar7 = aVar4;
        Class<AssetFileDescriptor> cls18 = cls8;
        Class<String> cls19 = String.class;
        Context context3 = context;
        d.mo65443d(cls17, cls12, dVar5).mo65443d(cls15, cls18, aVar7).mo65443d(cls17, cls18, aVar7).mo65443d(cls15, cls12, dVar5).mo65443d(cls19, cls3, new C22296e.C22299c()).mo65443d(cls12, cls3, new C22296e.C22299c()).mo65443d(cls19, cls3, new C22359u.C22362c()).mo65443d(cls19, cls6, new C22359u.C22361b()).mo65443d(cls19, cls18, new C22359u.C22360a()).mo65443d(cls12, cls3, new C22281a.C22284c(context.getAssets())).mo65443d(cls12, cls18, new C22281a.C22283b(context.getAssets())).mo65443d(cls12, cls3, new C22345d.C22346a(context3)).mo65443d(cls12, cls3, new C22347e.C22348a(context3));
        if (i3 >= 29) {
            registry.mo65443d(cls12, cls3, new C22349f.C22352c(context3));
            registry.mo65443d(cls12, cls6, new C22349f.C22351b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<C22309g> cls20 = C22309g.class;
        Class<byte[]> cls21 = byte[].class;
        Registry x = registry.mo65443d(cls12, cls3, new C22366w.C22370d(contentResolver2)).mo65443d(cls12, cls6, new C22366w.C22368b(contentResolver2)).mo65443d(cls12, cls18, new C22366w.C22367a(contentResolver2)).mo65443d(cls12, cls3, new C22371x.C22372a()).mo65443d(URL.class, cls3, new C22356i.C22357a()).mo65443d(cls12, cls14, new C22316k.C22317a(context3)).mo65443d(cls20, cls3, new C22341b.C22342a()).mo65443d(cls21, cls2, new C22285b.C22286a()).mo65443d(cls21, cls3, new C22285b.C22290d()).mo65443d(cls12, cls12, C22363v.C22364a.m101589b()).mo65443d(cls13, cls13, C22363v.C22364a.m101589b()).mo65442c(cls13, cls13, new C22467m()).mo65463x(cls4, cls9, new C22496b(resources));
        C22495a aVar8 = aVar5;
        C22498d dVar6 = dVar4;
        x.mo65463x(cls4, cls21, aVar8).mo65463x(cls13, cls21, new C22497c(eVar, aVar8, dVar6)).mo65463x(cls16, cls21, dVar6);
        C22278g<ByteBuffer, Bitmap> d2 = VideoDecoder.m101663d(eVar);
        registry.mo65442c(cls2, cls4, d2);
        registry.mo65442c(cls2, cls9, new C22392a(resources, d2));
        this.f56527d = new C22048d(context, bVar, registry, new C22578k(), aVar, map, list, iVar, eVar2, i);
    }

    @C0359n0
    /* renamed from: C */
    public static C22092j m100348C(@C0359n0 Activity activity) {
        return m100360p(activity).mo66609j(activity);
    }

    @C0359n0
    @Deprecated
    /* renamed from: D */
    public static C22092j m100349D(@C0359n0 Fragment fragment) {
        return m100360p(fragment.getActivity()).mo66610k(fragment);
    }

    @C0359n0
    /* renamed from: E */
    public static C22092j m100350E(@C0359n0 Context context) {
        return m100360p(context).mo66611l(context);
    }

    @C0359n0
    /* renamed from: F */
    public static C22092j m100351F(@C0359n0 View view) {
        return m100360p(view.getContext()).mo66612m(view);
    }

    @C0359n0
    /* renamed from: G */
    public static C22092j m100352G(@C0359n0 androidx.fragment.app.Fragment fragment) {
        return m100360p(fragment.getContext()).mo66613n(fragment);
    }

    @C0359n0
    /* renamed from: H */
    public static C22092j m100353H(@C0359n0 C19232h hVar) {
        return m100360p(hVar).mo66614o(hVar);
    }

    @C0323b0("Glide.class")
    /* renamed from: a */
    public static void m100354a(@C0359n0 Context context, @C0363p0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f56520E0) {
            f56520E0 = true;
            m100363s(context, generatedAppGlideModule);
            f56520E0 = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @C0344h1
    /* renamed from: d */
    public static void m100355d() {
        C22395b0.m101689d().mo66409l();
    }

    @C0359n0
    /* renamed from: e */
    public static C22038b m100356e(@C0359n0 Context context) {
        if (f56523Z == null) {
            GeneratedAppGlideModule f = m100357f(context.getApplicationContext());
            synchronized (C22038b.class) {
                if (f56523Z == null) {
                    m100354a(context, f);
                }
            }
        }
        return f56523Z;
    }

    @C0363p0
    /* renamed from: f */
    public static GeneratedAppGlideModule m100357f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e) {
            m100366z(e);
        } catch (IllegalAccessException e2) {
            m100366z(e2);
        } catch (NoSuchMethodException e3) {
            m100366z(e3);
        } catch (InvocationTargetException e4) {
            m100366z(e4);
        }
        return null;
    }

    @C0363p0
    /* renamed from: l */
    public static File m100358l(@C0359n0 Context context) {
        return m100359m(context, "image_manager_disk_cache");
    }

    @C0363p0
    /* renamed from: m */
    public static File m100359m(@C0359n0 Context context, @C0359n0 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @C0359n0
    /* renamed from: p */
    public static C22521q m100360p(@C0363p0 Context context) {
        C22633m.m102625e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m100356e(context).mo65485o();
    }

    @C0344h1
    /* renamed from: q */
    public static void m100361q(@C0359n0 Context context, @C0359n0 C22040c cVar) {
        GeneratedAppGlideModule f = m100357f(context);
        synchronized (C22038b.class) {
            if (f56523Z != null) {
                m100365y();
            }
            m100364t(context, cVar, f);
        }
    }

    @C0344h1
    @Deprecated
    /* renamed from: r */
    public static synchronized void m100362r(C22038b bVar) {
        synchronized (C22038b.class) {
            if (f56523Z != null) {
                m100365y();
            }
            f56523Z = bVar;
        }
    }

    @C0323b0("Glide.class")
    /* renamed from: s */
    public static void m100363s(@C0359n0 Context context, @C0363p0 GeneratedAppGlideModule generatedAppGlideModule) {
        m100364t(context, new C22040c(), generatedAppGlideModule);
    }

    @C0323b0("Glide.class")
    /* renamed from: t */
    public static void m100364t(@C0359n0 Context context, @C0359n0 C22040c cVar, @C0363p0 GeneratedAppGlideModule generatedAppGlideModule) {
        C22521q.C22523b bVar;
        Context applicationContext = context.getApplicationContext();
        List<C22540c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo66667c()) {
            emptyList = new C22542e(applicationContext).mo66669a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo65437d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo65437d();
            Iterator<C22540c> it = emptyList.iterator();
            while (it.hasNext()) {
                C22540c next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C22540c cVar2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(cVar2.getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.mo65438e();
        } else {
            bVar = null;
        }
        cVar.mo65514u(bVar);
        for (C22540c a : emptyList) {
            a.mo66666a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo66666a(applicationContext, cVar);
        }
        C22038b b = cVar.mo65495b(applicationContext);
        for (C22540c next2 : emptyList) {
            try {
                next2.mo66668b(applicationContext, b, b.f56528e);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo66668b(applicationContext, b, b.f56528e);
        }
        applicationContext.registerComponentCallbacks(b);
        f56523Z = b;
    }

    @C0344h1
    /* renamed from: y */
    public static void m100365y() {
        synchronized (C22038b.class) {
            if (f56523Z != null) {
                f56523Z.mo65482j().getApplicationContext().unregisterComponentCallbacks(f56523Z);
                f56523Z.f56524a.mo66135m();
            }
            f56523Z = null;
        }
    }

    /* renamed from: z */
    public static void m100366z(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: A */
    public void mo65475A(int i) {
        C22635o.m102627b();
        synchronized (this.f56532w) {
            for (C22092j onTrimMemory : this.f56532w) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f56526c.mo66036a(i);
        this.f56525b.mo65953a(i);
        this.f56529f.mo65930a(i);
    }

    /* renamed from: B */
    public void mo65476B(C22092j jVar) {
        synchronized (this.f56532w) {
            if (this.f56532w.contains(jVar)) {
                this.f56532w.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: b */
    public void mo65477b() {
        C22635o.m102626a();
        this.f56524a.mo66128e();
    }

    /* renamed from: c */
    public void mo65478c() {
        C22635o.m102627b();
        this.f56526c.mo66044b();
        this.f56525b.mo65954b();
        this.f56529f.mo65931b();
    }

    @C0359n0
    /* renamed from: g */
    public C22157b mo65479g() {
        return this.f56529f;
    }

    @C0359n0
    /* renamed from: h */
    public C22162e mo65480h() {
        return this.f56525b;
    }

    /* renamed from: i */
    public C22507d mo65481i() {
        return this.f56531v;
    }

    @C0359n0
    /* renamed from: j */
    public Context mo65482j() {
        return this.f56527d.getBaseContext();
    }

    @C0359n0
    /* renamed from: k */
    public C22048d mo65483k() {
        return this.f56527d;
    }

    @C0359n0
    /* renamed from: n */
    public Registry mo65484n() {
        return this.f56528e;
    }

    @C0359n0
    /* renamed from: o */
    public C22521q mo65485o() {
        return this.f56530g;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo65478c();
    }

    public void onTrimMemory(int i) {
        mo65475A(i);
    }

    /* renamed from: u */
    public synchronized void mo65489u(@C0359n0 C22265d.C22266a... aVarArr) {
        if (this.f56535z == null) {
            this.f56535z = new C22263b(this.f56526c, this.f56525b, (DecodeFormat) this.f56533x.mo65493g().mo66768V().mo66232c(C22439v.f57567g));
        }
        this.f56535z.mo66198c(aVarArr);
    }

    /* renamed from: v */
    public void mo65490v(C22092j jVar) {
        synchronized (this.f56532w) {
            if (!this.f56532w.contains(jVar)) {
                this.f56532w.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: w */
    public boolean mo65491w(@C0359n0 C22584p<?> pVar) {
        synchronized (this.f56532w) {
            for (C22092j b0 : this.f56532w) {
                if (b0.mo65738b0(pVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @C0359n0
    /* renamed from: x */
    public MemoryCategory mo65492x(@C0359n0 MemoryCategory memoryCategory) {
        C22635o.m102627b();
        this.f56526c.mo66045c(memoryCategory.mo65439g());
        this.f56525b.mo65955c(memoryCategory.mo65439g());
        MemoryCategory memoryCategory2 = this.f56534y;
        this.f56534y = memoryCategory;
        return memoryCategory2;
    }
}
