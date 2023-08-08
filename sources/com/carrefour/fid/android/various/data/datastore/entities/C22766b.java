package com.carrefour.fid.android.various.data.datastore.entities;

import java.util.Map;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.various.data.datastore.entities.b */
public interface C22766b {

    @C11363r0({"SMAP\nFirebaseNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseNotification.kt\ncom/carrefour/fid/android/various/data/datastore/entities/FirebaseNotification$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
    /* renamed from: com.carrefour.fid.android.various.data.datastore.entities.b$a */
    public static final class C22767a {
        /* renamed from: a */
        public static boolean m102956a(C22766b bVar, String str) {
            Object obj;
            if (str == null) {
                return false;
            }
            try {
                Result.C10852a aVar = Result.f28060a;
                obj = Result.m38702b(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            return Result.m38710j(obj);
        }

        /* renamed from: b */
        public static boolean m102957b(@C12579k C22766b bVar, @C12579k Map<String, String> map) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(map, "messages");
            if (!map.containsKey(bVar.mo67169b()) || !map.containsKey(bVar.mo67172e()) || !map.containsKey(bVar.mo67174g()) || !m102956a(bVar, map.get(bVar.mo67169b()))) {
                return false;
            }
            CharSequence charSequence = map.get(bVar.mo67174g());
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            CharSequence charSequence2 = map.get(bVar.mo67172e());
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.carrefour.fid.android.various.data.datastore.entities.b$b */
    public static final class C22768b implements C22766b {
        @C12579k

        /* renamed from: a */
        public static final C22768b f58300a = new C22768b();
        @C12579k

        /* renamed from: b */
        public static final String f58301b = "app_broadcast_message_button_text";
        @C12579k

        /* renamed from: c */
        public static final String f58302c = "app_broadcast_message_button_url";
        @C12579k

        /* renamed from: d */
        public static final String f58303d = "app_broadcast_message_close_text";
        @C12579k

        /* renamed from: e */
        public static final String f58304e = "app_broadcast_message_text";
        @C12579k

        /* renamed from: f */
        public static final String f58305f = "app_broadcast_message_title";
        @C12579k

        /* renamed from: g */
        public static final String f58306g = "app_broadcast_message_recurrence";

        @C12579k
        /* renamed from: a */
        public String mo67168a() {
            return f58302c;
        }

        @C12579k
        /* renamed from: b */
        public String mo67169b() {
            return f58306g;
        }

        @C12579k
        /* renamed from: c */
        public String mo67170c() {
            return f58303d;
        }

        @C12579k
        /* renamed from: d */
        public String mo67171d() {
            return f58301b;
        }

        @C12579k
        /* renamed from: e */
        public String mo67172e() {
            return f58305f;
        }

        /* renamed from: f */
        public boolean mo67173f(@C12579k Map<String, String> map) {
            return C22767a.m102957b(this, map);
        }

        @C12579k
        /* renamed from: g */
        public String mo67174g() {
            return f58304e;
        }
    }

    /* renamed from: com.carrefour.fid.android.various.data.datastore.entities.b$c */
    public static final class C22769c implements C22766b {
        @C12579k

        /* renamed from: a */
        public static final C22769c f58307a = new C22769c();
        @C12579k

        /* renamed from: b */
        public static final String f58308b = "app_version_message_button_text";
        @C12579k

        /* renamed from: c */
        public static final String f58309c = "app_version_message_button_url";
        @C12579k

        /* renamed from: d */
        public static final String f58310d = "app_version_message_close_text";
        @C12579k

        /* renamed from: e */
        public static final String f58311e = "app_version_message_text";
        @C12579k

        /* renamed from: f */
        public static final String f58312f = "app_version_message_title";
        @C12579k

        /* renamed from: g */
        public static final String f58313g = "app_version_message_recurrence";

        @C12579k
        /* renamed from: a */
        public String mo67168a() {
            return f58309c;
        }

        @C12579k
        /* renamed from: b */
        public String mo67169b() {
            return f58313g;
        }

        @C12579k
        /* renamed from: c */
        public String mo67170c() {
            return f58310d;
        }

        @C12579k
        /* renamed from: d */
        public String mo67171d() {
            return f58308b;
        }

        @C12579k
        /* renamed from: e */
        public String mo67172e() {
            return f58312f;
        }

        /* renamed from: f */
        public boolean mo67173f(@C12579k Map<String, String> map) {
            return C22767a.m102957b(this, map);
        }

        @C12579k
        /* renamed from: g */
        public String mo67174g() {
            return f58311e;
        }
    }

    @C12579k
    /* renamed from: a */
    String mo67168a();

    @C12579k
    /* renamed from: b */
    String mo67169b();

    @C12579k
    /* renamed from: c */
    String mo67170c();

    @C12579k
    /* renamed from: d */
    String mo67171d();

    @C12579k
    /* renamed from: e */
    String mo67172e();

    /* renamed from: f */
    boolean mo67173f(@C12579k Map<String, String> map);

    @C12579k
    /* renamed from: g */
    String mo67174g();
}
