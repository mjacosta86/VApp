package com.macostay.vapp.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.macostay.vapp.R;

/**
 * Created by macostay on 03/05/2016.
 */
public class DialogoConfirmacion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setMessage(getResources().getString(R.string.CONFIRMATION_MESSAGE))
                .setTitle(getResources().getString(R.string.CONFIRMACION))
                .setPositiveButton(getResources().getString(R.string.ACEPTAR), new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i(getResources().getString(R.string.DIALOGOS), getResources().getString(R.string.CONFIRMACION_ACEPTADA));
                        dialog.dismiss();
                        getActivity().finish();
                    }
                })
                .setNegativeButton(getResources().getString(R.string.CANCELAR), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i(getResources().getString(R.string.DIALOGOS), getResources().getString(R.string.CONFIRMACION_CANCELADA));
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
