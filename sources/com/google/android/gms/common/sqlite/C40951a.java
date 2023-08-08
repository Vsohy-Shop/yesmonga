package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.sqlite.a */
public class C40951a extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a */
    public AbstractWindowedCursor f104177a;

    @C40473a
    public C40951a(@C0359n0 Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof CursorWrapper); i++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (cursor instanceof AbstractWindowedCursor) {
            this.f104177a = (AbstractWindowedCursor) cursor;
            return;
        }
        throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
    }

    @C40473a
    /* renamed from: a */
    public void mo134740a(@C0363p0 CursorWindow cursorWindow) {
        this.f104177a.setWindow(cursorWindow);
    }

    @C40473a
    public void fillWindow(int i, @C0359n0 CursorWindow cursorWindow) {
        this.f104177a.fillWindow(i, cursorWindow);
    }

    @C0363p0
    @C40473a
    public CursorWindow getWindow() {
        return this.f104177a.getWindow();
    }

    @C0359n0
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f104177a;
    }

    public final boolean onMove(int i, int i2) {
        return this.f104177a.onMove(i, i2);
    }
}
