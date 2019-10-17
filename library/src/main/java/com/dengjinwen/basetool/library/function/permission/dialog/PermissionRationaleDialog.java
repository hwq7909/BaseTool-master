package com.dengjinwen.basetool.library.function.permission.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.dengjinwen.basetool.library.R;
import com.dengjinwen.basetool.library.function.permission.RequestExecutor;

public class PermissionRationaleDialog extends PermissionHintDialog {

    public PermissionRationaleDialog(@NonNull Context context, final RequestExecutor executor) {
        super(context);
        setTitle(context.getResources().getString(R.string.permission_title_permission_rationale))
                .setContent(context.getResources().getString(R.string.permission_message_permission_rationale))
                .setNegativeButton(context.getResources().getString(R.string.permission_cancel), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                })
                .setPositiveButton(context.getResources().getString(R.string.permission_resume), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                        executor.execute();
                    }
                });

    }
}
