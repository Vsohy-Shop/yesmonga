package com.urbanairship.automation.storage;

import androidx.annotation.RestrictTo;
import androidx.room.C20277a0;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.room.Index;
import com.urbanairship.json.C9329d;
import kotlinx.serialization.json.internal.C12361b;

@C20351p(foreignKeys = {@C20396v(childColumns = {"parentScheduleId"}, entity = C8954h.class, onDelete = 5, parentColumns = {"scheduleId"})}, indices = {@Index({"parentScheduleId"})}, tableName = "triggers")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.j */
public class C8956j {
    @C20340m0(autoGenerate = true)

    /* renamed from: a */
    public int f24041a;

    /* renamed from: b */
    public int f24042b;

    /* renamed from: c */
    public double f24043c;

    /* renamed from: d */
    public C9329d f24044d;

    /* renamed from: e */
    public boolean f24045e;

    /* renamed from: f */
    public double f24046f;

    /* renamed from: g */
    public String f24047g;

    @C20277a0
    public String toString() {
        return "TriggerEntity{id=" + this.f24041a + ", triggerType=" + this.f24042b + ", goal=" + this.f24043c + ", jsonPredicate=" + this.f24044d + ", isCancellation=" + this.f24045e + ", progress=" + this.f24046f + ", parentScheduleId='" + this.f24047g + '\'' + C12361b.f30259j;
    }
}
