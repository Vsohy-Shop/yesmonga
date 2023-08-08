package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.s1 */
public final class C20366s1 {
    @C12579k

    /* renamed from: a */
    public static final C20366s1 f52527a = new C20366s1();
    @C12579k

    /* renamed from: b */
    public static final String f52528b = "ROOM";
    @C12579k

    /* renamed from: c */
    public static final String f52529c = "room_master_table";
    @C12579k

    /* renamed from: d */
    public static final String f52530d = "_CursorConverter";

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final <T extends RoomDatabase> RoomDatabase.C20270a<T> m95111a(@C12579k Context context, @C12579k Class<T> cls, @C12580l String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cls, "klass");
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (true ^ z) {
            return new RoomDatabase.C20270a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    /* renamed from: b */
    public static final <T, C> T m95112b(@C12579k Class<C> cls, @C12579k String str) {
        boolean z;
        String str2;
        Intrinsics.checkNotNullParameter(cls, "klass");
        Intrinsics.checkNotNullParameter(str, "suffix");
        Package packageR = cls.getPackage();
        Intrinsics.checkNotNull(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(name, "fullPackage");
        boolean z2 = false;
        if (name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = C11622t.replace$default(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final <T extends RoomDatabase> RoomDatabase.C20270a<T> m95113c(@C12579k Context context, @C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cls, "klass");
        return new RoomDatabase.C20270a<>(context, cls, (String) null);
    }
}
