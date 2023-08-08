package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.e */
public class C35832e extends C35852s {
    @C0359n0

    /* renamed from: b */
    public final C35834b f88585b;

    /* renamed from: com.urbanairship.android.layout.property.e$a */
    public static class C35833a {
        @C0359n0

        /* renamed from: a */
        public final List<C35870a> f88586a;
        @C0363p0

        /* renamed from: b */
        public final Image.Icon f88587b;

        public C35833a(@C0359n0 List<C35870a> list, @C0363p0 Image.Icon icon) {
            this.f88586a = list;
            this.f88587b = icon;
        }

        @C0359n0
        /* renamed from: a */
        public static C35833a m147749a(@C0359n0 C9323b bVar) throws JsonException {
            Image.Icon icon;
            C9322a z = bVar.mo18801A("shapes").mo18784z();
            C9323b A = bVar.mo18801A("icon").mo18749A();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z.size(); i++) {
                arrayList.add(C35870a.m147950b(z.mo18791h(i).mo18749A()));
            }
            if (A.isEmpty()) {
                icon = null;
            } else {
                icon = Image.Icon.m147666c(A);
            }
            return new C35833a(arrayList, icon);
        }

        @C0363p0
        /* renamed from: b */
        public Image.Icon mo107338b() {
            return this.f88587b;
        }

        @C0359n0
        /* renamed from: c */
        public List<C35870a> mo107339c() {
            return this.f88586a;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.e$b */
    public static class C35834b {
        @C0359n0

        /* renamed from: a */
        public final C35833a f88588a;
        @C0359n0

        /* renamed from: b */
        public final C35833a f88589b;

        public C35834b(@C0359n0 C35833a aVar, @C0359n0 C35833a aVar2) {
            this.f88588a = aVar;
            this.f88589b = aVar2;
        }

        /* renamed from: a */
        public static C35834b m147752a(@C0359n0 C9323b bVar) throws JsonException {
            return new C35834b(C35833a.m147749a(bVar.mo18801A("selected").mo18749A()), C35833a.m147749a(bVar.mo18801A("unselected").mo18749A()));
        }

        @C0359n0
        /* renamed from: b */
        public C35833a mo107340b() {
            return this.f88588a;
        }

        @C0359n0
        /* renamed from: c */
        public C35833a mo107341c() {
            return this.f88589b;
        }
    }

    public C35832e(@C0359n0 C35834b bVar) {
        super(ToggleType.CHECKBOX);
        this.f88585b = bVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C35832e m147747c(@C0359n0 C9323b bVar) throws JsonException {
        return new C35832e(C35834b.m147752a(bVar.mo18801A("bindings").mo18749A()));
    }

    @C0359n0
    /* renamed from: d */
    public C35834b mo107337d() {
        return this.f88585b;
    }
}
