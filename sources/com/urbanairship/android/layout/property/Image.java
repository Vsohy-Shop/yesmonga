package com.urbanairship.android.layout.property;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.widget.C36023m;
import com.urbanairship.javascript.C9289c;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public abstract class Image {
    @C0359n0

    /* renamed from: a */
    public final Type f88476a;

    public static final class Icon extends Image {
        @C0359n0

        /* renamed from: b */
        public final DrawableResource f88477b;
        @C0359n0

        /* renamed from: c */
        public final C35835f f88478c;

        /* renamed from: d */
        public final float f88479d;

        public enum DrawableResource {
            CLOSE(C9289c.f25333j, C35625g.C35632g.ua_layout_ic_close),
            CHECKMARK("checkmark", C35625g.C35632g.ua_layout_ic_check),
            ARROW_FORWARD("forward_arrow", C35625g.C35632g.ua_layout_ic_arrow_forward),
            ARROW_BACK("back_arrow", C35625g.C35632g.ua_layout_ic_arrow_back);
            
            /* access modifiers changed from: private */
            @C0375v
            public final int resId;
            @C0359n0
            private final String value;

            /* access modifiers changed from: public */
            DrawableResource(@C0359n0 String str, int i) {
                this.value = str;
                this.resId = i;
            }

            @C0359n0
            /* renamed from: q */
            public static DrawableResource m147673q(String str) throws JsonException {
                for (DrawableResource drawableResource : values()) {
                    if (drawableResource.value.equals(str.toLowerCase(Locale.ROOT))) {
                        return drawableResource;
                    }
                }
                throw new JsonException("Unknown icon drawable resource: " + str);
            }
        }

        public Icon(@C0359n0 DrawableResource drawableResource, @C0359n0 C35835f fVar, float f) {
            super(Type.ICON, (C35816a) null);
            this.f88477b = drawableResource;
            this.f88478c = fVar;
            this.f88479d = f;
        }

        @C0359n0
        /* renamed from: c */
        public static Icon m147666c(@C0359n0 C9323b bVar) throws JsonException {
            DrawableResource b = DrawableResource.m147673q(bVar.mo18801A("icon").mo18750B());
            C35835f c = C35835f.m147757c(bVar, "color");
            if (c != null) {
                return new Icon(b, c, bVar.mo18801A("scale").mo18760e(1.0f));
            }
            throw new JsonException("Failed to parse icon! Field 'color' is required.");
        }

        @C0363p0
        /* renamed from: d */
        public Drawable mo107277d(@C0359n0 Context context) {
            Drawable i = C17318d.m79726i(context, mo107278e());
            if (i == null) {
                return null;
            }
            C17549d.m80452n(i, this.f88478c.mo107342d(context));
            return new C36023m(i, 1.0f, this.f88479d);
        }

        @C0375v
        /* renamed from: e */
        public int mo107278e() {
            return this.f88477b.resId;
        }

        /* renamed from: f */
        public float mo107279f() {
            return this.f88479d;
        }

        @C0359n0
        /* renamed from: g */
        public C35835f mo107280g() {
            return this.f88478c;
        }
    }

    public enum Type {
        URL("url"),
        ICON("icon");
        
        @C0359n0
        private final String value;

        /* access modifiers changed from: public */
        Type(@C0359n0 String str) {
            this.value = str;
        }

        @C0359n0
        /* renamed from: b */
        public static Type m147674b(@C0359n0 String str) throws JsonException {
            for (Type type : values()) {
                if (type.value.equals(str.toLowerCase(Locale.ROOT))) {
                    return type;
                }
            }
            throw new JsonException("Unknown button image type value: " + str);
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.Image$a */
    public static /* synthetic */ class C35816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88488a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.urbanairship.android.layout.property.Image$Type[] r0 = com.urbanairship.android.layout.property.Image.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88488a = r0
                com.urbanairship.android.layout.property.Image$Type r1 = com.urbanairship.android.layout.property.Image.Type.URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f88488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.Image$Type r1 = com.urbanairship.android.layout.property.Image.Type.ICON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.property.Image.C35816a.<clinit>():void");
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.Image$b */
    public static final class C35817b extends Image {
        @C0359n0

        /* renamed from: b */
        public final String f88489b;

        public C35817b(@C0359n0 String str) {
            super(Type.URL, (C35816a) null);
            this.f88489b = str;
        }

        @C0359n0
        /* renamed from: c */
        public static C35817b m147675c(@C0359n0 C9323b bVar) {
            return new C35817b(bVar.mo18801A("url").mo18750B());
        }

        @C0359n0
        /* renamed from: d */
        public String mo107281d() {
            return this.f88489b;
        }
    }

    public /* synthetic */ Image(Type type, C35816a aVar) {
        this(type);
    }

    @C0359n0
    /* renamed from: a */
    public static Image m147664a(@C0359n0 C9323b bVar) throws JsonException {
        String B = bVar.mo18801A("type").mo18750B();
        int i = C35816a.f88488a[Type.m147674b(B).ordinal()];
        if (i == 1) {
            return C35817b.m147675c(bVar);
        }
        if (i == 2) {
            return Icon.m147666c(bVar);
        }
        throw new JsonException("Failed to parse image! Unknown button image type value: " + B);
    }

    @C0359n0
    /* renamed from: b */
    public Type mo107276b() {
        return this.f88476a;
    }

    public Image(@C0359n0 Type type) {
        this.f88476a = type;
    }
}
