<template>
	<center>
	<div class="view-div">
		<h2>商品情報送信</h2>
		<center>
		<table>
			<tr>
				<td>商品コード</td>
				<td><input type="text" v-model="goods.code"></td>
			</tr>
			<tr>
				<td>商品名</td>
				<td><input type="text" v-model="goods.name"></td>
			</tr>
			<tr>
				<td>商品カテゴリ</td>
				<td><input type="text" v-model="goods.category"></td>
			</tr>
		</table>
		</center><br/>
		<button v-on:click="send">送信</button><br/><br/>
	</div>
	
	<div class="view-div">
		<h2>結果表示</h2>
		<center>
		<table>
			<tr>
				<td>商品コード</td>
				<td>{{ revGoods.code }}</td>
			</tr>
			<tr>
				<td>商品名</td>
				<td>{{ revGoods.name }}</td>
			</tr>
			<tr>
				<td>商品カテゴリ</td>
				<td>{{ revGoods.category }}</td>
			</tr>
		</table>
		</center>
	</div>
	</center>
</template>

<script>
import * as axios from 'axios'

export default {
	components: {
	},
	name: 'SendGoods',
	data: () => ({
		goods : {code:'',name:'',category:''},
		revGoods: {code:'',name:'',category:''}
	}),
	methods: {
		send: function(){
			axios.post('/goods/recieve', this.goods).
				then(response => {
					this.revGoods = response.data
				})
		}
	}
}
</script>