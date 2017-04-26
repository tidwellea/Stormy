package com.example.evantidwell.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.example.evantidwell.stormy.R;

public class AlertDialogFragment extends DialogFragment {
    private String message;

    public AlertDialogFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        Bundle arguments = getArguments();
        String message = arguments.getString("message");
        this.message = message;

        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(message)
                .setPositiveButton(context.getString(R.string.error_ok_button_text), null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
