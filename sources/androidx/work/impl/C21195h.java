package androidx.work.impl;

import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.h */
public final class C21195h extends C20343b {
    @C12579k

    /* renamed from: c */
    public static final C21195h f54708c = new C21195h();

    public C21195h() {
        super(15, 16);
    }

    /* renamed from: a */
    public void mo17636a(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        fVar.mo60782s0("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        fVar.mo60782s0("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        fVar.mo60782s0("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        fVar.mo60782s0("DROP TABLE `SystemIdInfo`");
        fVar.mo60782s0("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
