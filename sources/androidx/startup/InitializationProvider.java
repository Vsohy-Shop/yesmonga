package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class InitializationProvider extends ContentProvider {
    public final int delete(@C0359n0 Uri uri, @C0363p0 String str, @C0363p0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @C0363p0
    public final String getType(@C0359n0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @C0363p0
    public final Uri insert(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            C20495a.m95528e(context).mo61435a();
            return true;
        }
    }

    @C0363p0
    public final Cursor query(@C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 String str, @C0363p0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
