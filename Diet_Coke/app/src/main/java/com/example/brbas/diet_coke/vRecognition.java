package com.example.brbas.diet_coke;

/**
 * Created by brbas on 4/29/2017.
 */
import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;

import java.io.File;


public class vRecognition {


    /*public static String imageFolder = null;

    private VisualRecognition initVisualRecognitionService() {
        VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
        service.setApiKey("9086b4e69f9dc981377417bed1e5ad3464a95817");
        return service;
    }

    private class WatsonTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {


            VisualRecognition vRservice = initVisualRecognitionService();
            System.out.println("Classify an image");
            ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
                    .images(new File(imageFolder, "IMAGE_TEST.jpg"))
                    .build();
            VisualClassification result = vRservice.classify(options).execute();
            System.out.println(result);

            return result.toString();

        }

    }

    public void startWatson (String iFolder) {
        imageFolder = iFolder;
        WatsonTask task = new WatsonTask();
        task.execute();
        //System.out.println(imageFolder);
        //Toast.makeText(getApplicationContext(), "AF Locked!", Toast.LENGTH_SHORT).show();
    }*/





}
