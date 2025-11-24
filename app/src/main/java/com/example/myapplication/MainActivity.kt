package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoriesRecyclerView = findViewById<RecyclerView>(R.id.categoriesRecyclerView)

        categoriesRecyclerView.layoutManager = LinearLayoutManager(this)
        categoriesRecyclerView.adapter = MixedCategoryAdapter(getSampleData())
    }

    private fun getSuggestedData(): List<List<SuggestedAppModel>> {
        val allApps = listOf(
            SuggestedAppModel("Mech Assemble: Zombie Swarm", "Action", "Role Playing • Roguelike • Zombie", 4.8f, Color.parseColor("#8B0000")),
            SuggestedAppModel("MU: Hồng Hoá Đạo", "Role Playing", "Role Playing", 4.8f, Color.parseColor("#B22222")),
            SuggestedAppModel("War Inc: Rising", "Strategy", "Strategy • Tower defense", 4.9f, Color.parseColor("#FFA500")),
            SuggestedAppModel("SHEIN-Shopping Online", "Shopping", "Shopping • Retailer", 4.1f, Color.parseColor("#000000")),
            SuggestedAppModel("EA SPORTS App", "Sports", "Sports", 3.5f, Color.parseColor("#0066CC")),
            SuggestedAppModel("Temu: Shop Like a Billionaire", "Shopping", "Shopping • Online marketplace", 4.6f, Color.parseColor("#FF6700")),
            SuggestedAppModel("Amazon Shopping", "Shopping", "Shopping • Online Store", 4.4f, Color.parseColor("#FF9900")),
            SuggestedAppModel("Zalando", "Shopping", "Shopping • Fashion", 4.2f, Color.parseColor("#FF6900")),
            SuggestedAppModel("AliExpress", "Shopping", "Shopping • Marketplace", 4.3f, Color.parseColor("#E62E04"))
        )

        return allApps.chunked(3)
    }

    private fun getSampleData(): List<CategoryItem> {
        return listOf(
            CategoryItem.SuggestedCategory(getSuggestedData()),
            CategoryItem.NormalCategory(
                CategoryModel(
                    title = "Recommended for you",
                    apps = listOf(
                        AppModel("Suno - AI Music & Songs", "Music", 4.5f, Color.parseColor("#FF6B35")),
                        AppModel("Claude by Anthropic", "Productivity", 4.6f, Color.parseColor("#D4A574")),
                        AppModel("DramaBox - Short Drama", "Entertainment", 4.3f, Color.parseColor("#FF1493")),
                        AppModel("Pinterest", "Social", 4.4f, Color.parseColor("#E60023")),
                        AppModel("Instagram", "Social", 4.5f, Color.parseColor("#E1306C")),
                        AppModel("TikTok", "Entertainment", 4.6f, Color.parseColor("#000000"))
                    )
                )
            )
        )
    }
}
