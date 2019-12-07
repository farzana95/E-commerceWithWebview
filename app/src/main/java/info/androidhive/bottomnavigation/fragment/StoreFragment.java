package info.androidhive.bottomnavigation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import info.androidhive.bottomnavigation.R;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class StoreFragment extends Fragment {

    private WebView mywebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_store, container, false);

        mywebView = (WebView) rootView.findViewById(R.id.webView);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://m.1and9apparel.com");
        mywebView.setWebViewClient(new WebViewClient());
        /*FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.commit();*/
        return rootView;
    }
}