package com.urbanairship.automation.limits.storage;

import androidx.annotation.RestrictTo;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.room.Index;

@C20351p(foreignKeys = {@C20396v(childColumns = {"parentConstraintId"}, entity = C8915a.class, onDelete = 5, parentColumns = {"constraintId"})}, indices = {@Index({"parentConstraintId"})}, tableName = "occurrences")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.limits.storage.d */
public class C8922d {
    @C20340m0(autoGenerate = true)

    /* renamed from: a */
    public int f23906a;

    /* renamed from: b */
    public String f23907b;

    /* renamed from: c */
    public long f23908c;
}
