package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.C0359n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.n */
public class C22138n extends C22129l<InputStream> {

    /* renamed from: e */
    public static final int f56849e = 1;

    /* renamed from: f */
    public static final int f56850f = 2;

    /* renamed from: g */
    public static final int f56851g = 3;

    /* renamed from: v */
    public static final int f56852v = 4;

    /* renamed from: w */
    public static final int f56853w = 5;

    /* renamed from: x */
    public static final UriMatcher f56854x;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f56854x = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C22138n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @C0359n0
    /* renamed from: a */
    public Class<InputStream> mo65784a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo65785c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo65786f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = mo65837i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream mo65837i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f56854x.match(uri);
        if (match != 1) {
            if (match == 3) {
                return mo65838j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return mo65838j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream mo65838j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
