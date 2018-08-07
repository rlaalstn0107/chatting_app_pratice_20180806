package com.example.alstn0107.chatting_app_pratice_20180806;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String[] mDataset= {"안녕","오늘","뭐했어","영화볼래?"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Button btnFinish=(Button)findViewById(R.id.btnFinish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();


            }
        });

        mRecyclerView = (RecyclerView)findViewById(R.id.myreclcer_view);

        mRecyclerView.setHasFixedSize(true); //사이즈 높이 적절히해서 메모리 남비줄여서 더빠르게

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter= new MyAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);

    }
}
