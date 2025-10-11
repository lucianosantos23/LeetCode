#include <vector>
#include <iostream>
using namespace std;

//usar BFS

class Solution {
public:
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) 
    {
        vector<vector<int>> possiveis;
        for(int i = 0; i < heights.size(); i++)
        {
            for(int j = 0; j < heights[i].size(); j++)
            {
                if(( pacificoVertical(heights, i, j) || pacificoHorizontal(heights, i, j) )   && ( atlanticoVertical(heights, i, j) || atlanticoHorizontal(heights, i, j) ))
                    possiveis.push_back({i,j});         
            }
        }
        return possiveis;
    }

    bool pacificoVertical(vector<vector<int>>&heights, int atualI, int atualJ)
    {
        if( atualI == 0 ) return true;
        for(int i = atualI-1; i >= 0; i--) 
            if(heights[i][atualJ] >= heights[atualI][atualJ]) return false;
        return true;
    }

    bool pacificoHorizontal(vector<vector<int>>&heights, int atualI, int atualJ)
    {
        if( atualJ == 0 ) return true;
        for(int j = atualJ-1; j >= 0; j--) 
            if(heights[atualI][j] >= heights[atualI][atualJ]) return false;

        return true;
    }

    bool atlanticoVertical(vector<vector<int>>&heights, int atualI, int atualJ)
    {
        if( atualI == heights.size()-1 ) return true;
        for(int i = atualI+1; i < heights.size(); i++) 
            if(heights[i][atualJ] > heights[atualI][atualJ]  ) return false;
        return true;
    }

    bool atlanticoHorizontal(vector<vector<int>>&heights, int atualI, int atualJ)
    {
        if( atualJ == heights[atualI].size() - 1 ) return true;
        for(int j = atualJ+1; j < heights[atualI].size(); j++) 
            if(heights[j][atualI] >= heights[atualI][atualJ]) return false;

        return true;
    }
};